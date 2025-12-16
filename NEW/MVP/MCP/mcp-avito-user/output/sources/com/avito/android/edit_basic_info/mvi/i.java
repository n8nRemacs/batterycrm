package com.avito.android.edit_basic_info.mvi;

import com.avito.android.edit_basic_info.model.EditBasicInfoArguments;
import com.avito.android.profile_settings_extended.adapter.basic_info_v2.BasicInfoV2Item;
import com.avito.android.remote.model.Image;
import com.avito.android.remote.model.extended.BasicInfoV2Widget;
import dagger.internal.x;
import dagger.internal.y;
import kotlin.jvm.internal.L;

/* compiled from: EditBasicInfoFeatureBuilder_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes13.dex */
public final class i implements dagger.internal.h<h> {

    /* renamed from: a, reason: collision with root package name */
    public final d f146167a;

    /* renamed from: b, reason: collision with root package name */
    public final k f146168b;

    /* renamed from: c, reason: collision with root package name */
    public final m f146169c;

    /* renamed from: d, reason: collision with root package name */
    public final f f146170d;

    /* renamed from: e, reason: collision with root package name */
    public final dagger.internal.l f146171e;

    public i(d dVar, k kVar, m mVar, f fVar, dagger.internal.l lVar) {
        this.f146167a = dVar;
        this.f146168b = kVar;
        this.f146169c = mVar;
        this.f146170d = fVar;
        this.f146171e = lVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        b bVar = (b) this.f146167a.get();
        this.f146168b.getClass();
        j jVar = new j();
        l lVar = (l) this.f146169c.get();
        this.f146170d.getClass();
        e eVar = new e();
        EditBasicInfoArguments editBasicInfoArguments = (EditBasicInfoArguments) this.f146171e.f393949a;
        ky.c.f413319u.getClass();
        BasicInfoV2Item basicInfoV2Item = editBasicInfoArguments.f146101b;
        BasicInfoV2Item.Avatar avatar = basicInfoV2Item.f229214j;
        Image image = avatar.f229222b;
        String str = basicInfoV2Item.f229212h;
        String str2 = str == null ? "" : str;
        BasicInfoV2Widget.EditorConfig editorConfig = basicInfoV2Item.f229219o;
        BasicInfoV2Widget.EditorVerticalConfig vertical = editorConfig.getVertical();
        String value = vertical != null ? vertical.getValue() : null;
        BasicInfoV2Widget.EditorVerticalConfig vertical2 = editorConfig.getVertical();
        Integer numValueOf = vertical2 != null ? Integer.valueOf(vertical2.getId()) : null;
        BasicInfoV2Widget.EditorSpecificConfig specific = editorConfig.getSpecific();
        String value2 = specific != null ? specific.getValue() : null;
        BasicInfoV2Widget.EditorSpecificConfig specific2 = editorConfig.getSpecific();
        Integer numValueOf2 = specific2 != null ? Integer.valueOf(specific2.getId()) : null;
        BasicInfoV2Widget.EditorVerticalConfig vertical3 = editorConfig.getVertical();
        boolean z12 = ((vertical3 != null ? L.f(vertical3.getHasMultipleSpecifics(), Boolean.FALSE) : false) || editorConfig.getSpecific() == null) ? false : true;
        BasicInfoV2Item.PersonalLink personalLink = basicInfoV2Item.f229216l;
        String str3 = personalLink != null ? personalLink.f229231b : null;
        String str4 = str3 == null ? "" : str3;
        BasicInfoV2Widget.ServicesSellerTypeConfig sellerType = editorConfig.getSellerType();
        return new h("EditBasicInfo", new ky.c(image, avatar.f229223c, avatar.f229224d, null, false, str2, null, false, value, numValueOf, value2, numValueOf2, z12, str4, null, sellerType != null ? ky.e.a(sellerType) : null, false, false, null), new g(eVar, bVar, lVar, jVar));
    }
}
