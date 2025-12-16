package com.avito.android.remote.model.section;

import Y61.k;
import com.avito.android.remote.model.section.SectionTypeElement;
import kotlin.Metadata;

/* compiled from: SectionGroupTypeElement.kt */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u0005H\u0016J\u0010\u0010\b\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\u0001H&¨\u0006\n"}, d2 = {"Lcom/avito/android/remote/model/section/SectionGroupTypeElement;", "Lcom/avito/android/remote/model/section/SectionTypeElement;", "containsSection", "", "sectionId", "", "isSectionWithId", "targetSectionId", "updateSection", "section", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public interface SectionGroupTypeElement extends SectionTypeElement {

    /* compiled from: SectionGroupTypeElement.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class DefaultImpls {
        public static boolean getHasContent(@k SectionGroupTypeElement sectionGroupTypeElement) {
            return SectionTypeElement.DefaultImpls.getHasContent(sectionGroupTypeElement);
        }

        @k
        public static String getSectionId(@k SectionGroupTypeElement sectionGroupTypeElement) {
            return SectionTypeElement.DefaultImpls.getSectionId(sectionGroupTypeElement);
        }

        public static boolean isSectionWithId(@k SectionGroupTypeElement sectionGroupTypeElement, @k String str) {
            return sectionGroupTypeElement.containsSection(str);
        }
    }

    boolean containsSection(@k String sectionId);

    @Override // com.avito.android.remote.model.section.SectionTypeElement
    boolean isSectionWithId(@k String targetSectionId);

    @k
    SectionGroupTypeElement updateSection(@k SectionTypeElement section);
}
