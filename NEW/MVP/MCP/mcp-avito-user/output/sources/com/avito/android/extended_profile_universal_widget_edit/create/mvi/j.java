package com.avito.android.extended_profile_universal_widget_edit.create.mvi;

import com.avito.android.arch.mvi.u;
import com.avito.android.extended_profile_universal_widget_edit.UniversalWidgetCreateArguments;
import com.avito.android.extended_profile_universal_widget_edit.create.mvi.entity.UniversalWidgetCreateInternalAction;
import com.avito.android.remote.model.extended.UniversalWidget;
import hB.C40800c;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: UniversalWidgetCreateReducer.kt */
@s0
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/avito/android/extended_profile_universal_widget_edit/create/mvi/j;", "Lcom/avito/android/arch/mvi/u;", "Lcom/avito/android/extended_profile_universal_widget_edit/create/mvi/entity/UniversalWidgetCreateInternalAction;", "LhB/c;", "_avito_extended-profile-universal-widget-edit_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class j implements u<UniversalWidgetCreateInternalAction, C40800c> {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final UniversalWidgetCreateArguments f153771b;

    /* compiled from: UniversalWidgetCreateReducer.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f153772a;

        /* renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ int[] f153773b;

        static {
            int[] iArr = new int[UniversalWidget.SectionSubtype.values().length];
            try {
                iArr[UniversalWidget.SectionSubtype.COMMON_FACTOID.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[UniversalWidget.SectionSubtype.FULL_WIDTH.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[UniversalWidget.SectionSubtype.IMAGE_WITH_TEXT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[UniversalWidget.SectionSubtype.TWO_COLUMNS.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[UniversalWidget.SectionSubtype.THREE_COLUMNS.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[UniversalWidget.SectionSubtype.FOUR_COLUMNS.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            f153772a = iArr;
            int[] iArr2 = new int[UniversalWidget.SectionType.values().length];
            try {
                iArr2[UniversalWidget.SectionType.FACTOID.ordinal()] = 1;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr2[UniversalWidget.SectionType.TEXT.ordinal()] = 2;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr2[UniversalWidget.SectionType.IMAGE_WITH_TEXT.ordinal()] = 3;
            } catch (NoSuchFieldError unused9) {
            }
            f153773b = iArr2;
        }
    }

    @Inject
    public j(@Y61.k UniversalWidgetCreateArguments universalWidgetCreateArguments) {
        this.f153771b = universalWidgetCreateArguments;
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x0067  */
    @Override // com.avito.android.arch.mvi.u
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final hB.C40800c a(com.avito.android.extended_profile_universal_widget_edit.create.mvi.entity.UniversalWidgetCreateInternalAction r20, hB.C40800c r21) {
        /*
            Method dump skipped, instructions count: 484
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.extended_profile_universal_widget_edit.create.mvi.j.a(java.lang.Object, java.lang.Object):java.lang.Object");
    }
}
