package com.avito.android.remote.model.section;

import Y61.k;
import Y61.l;
import aW.InterfaceC19825c;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: SectionTypeElement.kt */
@InterfaceC19825c
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0011\bg\u0018\u00002\u00020\u0001J\u0010\u0010\u0016\u001a\u00020\u00032\u0006\u0010\u0017\u001a\u00020\u0007H\u0016R\u0014\u0010\u0002\u001a\u00020\u00038VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005R\u0018\u0010\u0006\u001a\u00020\u0007X¦\u000e¢\u0006\f\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u0018\u0010\f\u001a\u00020\u0007X¦\u000e¢\u0006\f\u001a\u0004\b\r\u0010\t\"\u0004\b\u000e\u0010\u000bR\u0014\u0010\u000f\u001a\u0004\u0018\u00010\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0011\u001a\u0004\u0018\u00010\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0010R\u0014\u0010\u0012\u001a\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\tR\u0014\u0010\u0014\u001a\u0004\u0018\u00010\u0007X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0015\u0010\t¨\u0006\u0018"}, d2 = {"Lcom/avito/android/remote/model/section/SectionTypeElement;", "Landroid/os/Parcelable;", "hasContent", "", "getHasContent", "()Z", "iconUri", "", "getIconUri", "()Ljava/lang/String;", "setIconUri", "(Ljava/lang/String;)V", "id", "getId", "setId", "isAvailableToHide", "()Ljava/lang/Boolean;", "isCollapsed", "sectionId", "getSectionId", "title", "getTitle", "isSectionWithId", "targetSectionId", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public interface SectionTypeElement extends Parcelable {

    /* compiled from: SectionTypeElement.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class DefaultImpls {
        public static boolean getHasContent(@k SectionTypeElement sectionTypeElement) {
            return false;
        }

        @k
        public static String getSectionId(@k SectionTypeElement sectionTypeElement) {
            return sectionTypeElement.getId();
        }

        public static boolean isSectionWithId(@k SectionTypeElement sectionTypeElement, @k String str) {
            return L.f(sectionTypeElement.getSectionId(), str);
        }
    }

    boolean getHasContent();

    @k
    String getIconUri();

    @k
    String getId();

    @k
    String getSectionId();

    @l
    String getTitle();

    @l
    Boolean isAvailableToHide();

    @l
    Boolean isCollapsed();

    boolean isSectionWithId(@k String targetSectionId);

    void setIconUri(@k String str);

    void setId(@k String str);
}
