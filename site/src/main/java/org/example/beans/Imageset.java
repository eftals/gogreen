package org.example.beans;

import org.onehippo.cms7.essentials.dashboard.annotations.HippoEssentialsGenerated;
import org.hippoecm.hst.content.beans.Node;
import org.hippoecm.hst.content.beans.standard.HippoGalleryImageSet;
import org.hippoecm.hst.content.beans.standard.HippoGalleryImageBean;

@HippoEssentialsGenerated(internalName = "gogreen:imageset")
@Node(jcrType = "gogreen:imageset")
public class Imageset extends HippoGalleryImageSet {
	@HippoEssentialsGenerated(internalName = "gogreen:small")
	public HippoGalleryImageBean getSmall() {
		return getBean("gogreen:small", HippoGalleryImageBean.class);
	}

	@HippoEssentialsGenerated(internalName = "gogreen:large")
	public HippoGalleryImageBean getLarge() {
		return getBean("gogreen:large", HippoGalleryImageBean.class);
	}

	@HippoEssentialsGenerated(internalName = "gogreen:banner")
	public HippoGalleryImageBean getBanner() {
		return getBean("gogreen:banner", HippoGalleryImageBean.class);
	}

	@HippoEssentialsGenerated(internalName = "gogreen:hugeimage")
	public HippoGalleryImageBean getHugeimage() {
		return getBean("gogreen:hugeimage", HippoGalleryImageBean.class);
	}
}
