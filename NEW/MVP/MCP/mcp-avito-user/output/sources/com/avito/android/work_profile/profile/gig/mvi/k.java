package com.avito.android.work_profile.profile.gig.mvi;

import android.app.Application;
import android.content.res.Resources;
import cQ0.C27085a;
import cQ0.C27088d;
import com.avito.android.gig_snippet.list.snippet.GigShiftSnippetTimer;
import com.avito.android.work_profile.generated.api.get_profile_about_v_3.PaymentItem;
import com.avito.android.work_profile.generated.api.get_profile_about_v_3.PersonalItemV3;
import com.avito.android.work_profile.generated.api.get_profile_about_v_3.ProfileAboutBlock;
import com.avito.android.work_profile.generated.api.get_profile_about_v_3.Timer;
import com.avito.android.work_profile.profile.gig.ui.list.title_item.GigTitleItem;
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: GigResponseToItemsMapper.kt */
@s0
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u0001¨\u0006\u0005"}, d2 = {"Lcom/avito/android/work_profile/profile/gig/mvi/k;", "Lkotlin/Function1;", "LcQ0/e;", "", "Lcom/avito/conveyor_item/a;", "_avito_job_work-profile_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class k implements Y41.l<cQ0.e, List<? extends com.avito.conveyor_item.a>> {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.gig_snippet.a f331141b;

    /* renamed from: c, reason: collision with root package name */
    public final Resources f331142c;

    /* compiled from: GigResponseToItemsMapper.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f331143a;

        /* renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ int[] f331144b;

        /* renamed from: c, reason: collision with root package name */
        public static final /* synthetic */ int[] f331145c;

        /* renamed from: d, reason: collision with root package name */
        public static final /* synthetic */ int[] f331146d;

        /* renamed from: e, reason: collision with root package name */
        public static final /* synthetic */ int[] f331147e;

        static {
            int[] iArr = new int[ProfileAboutBlock.Type.values().length];
            try {
                iArr[ProfileAboutBlock.Type.Payment.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ProfileAboutBlock.Type.Personal.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[ProfileAboutBlock.Type.Slots.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[ProfileAboutBlock.Type.Motivations.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            f331143a = iArr;
            int[] iArr2 = new int[Timer.Direction.values().length];
            try {
                iArr2[Timer.Direction.UntilStart.ordinal()] = 1;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr2[Timer.Direction.UntilFinished.ordinal()] = 2;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr2[Timer.Direction.AfterStart.ordinal()] = 3;
            } catch (NoSuchFieldError unused7) {
            }
            f331144b = iArr2;
            int[] iArr3 = new int[PaymentItem.Icon.values().length];
            try {
                iArr3[PaymentItem.Icon.Sbp.ordinal()] = 1;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr3[PaymentItem.Icon.Card.ordinal()] = 2;
            } catch (NoSuchFieldError unused9) {
            }
            f331145c = iArr3;
            int[] iArr4 = new int[PaymentItem.Status.values().length];
            try {
                iArr4[PaymentItem.Status.Failed.ordinal()] = 1;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr4[PaymentItem.Status.Normal.ordinal()] = 2;
            } catch (NoSuchFieldError unused11) {
            }
            f331146d = iArr4;
            int[] iArr5 = new int[PersonalItemV3.Status.values().length];
            try {
                iArr5[PersonalItemV3.Status.NotStarted.ordinal()] = 1;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                iArr5[PersonalItemV3.Status.InProgress.ordinal()] = 2;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                iArr5[PersonalItemV3.Status.Success.ordinal()] = 3;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                iArr5[PersonalItemV3.Status.Failed.ordinal()] = 4;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                iArr5[PersonalItemV3.Status.Expiring.ordinal()] = 5;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                iArr5[PersonalItemV3.Status.Disabled.ordinal()] = 6;
            } catch (NoSuchFieldError unused17) {
            }
            f331147e = iArr5;
        }
    }

    @Inject
    public k(@Y61.k com.avito.android.gig_snippet.a aVar, @Y61.k Application application) {
        this.f331141b = aVar;
        this.f331142c = application.getResources();
    }

    public static GigTitleItem d(ProfileAboutBlock profileAboutBlock, C27088d c27088d) {
        C27085a action;
        String title = profileAboutBlock.getTitle();
        String subtitle = profileAboutBlock.getSubtitle();
        C27085a action2 = profileAboutBlock.getAction();
        return new GigTitleItem(title, subtitle, action2 != null ? action2.getUri() : null, c27088d != null ? c27088d.getText() : null, (c27088d == null || (action = c27088d.getAction()) == null) ? null : action.getUri(), null, 32, null);
    }

    public final GigShiftSnippetTimer a(String str, String str2, String str3, int i12, boolean z12) {
        Long lC2 = this.f331141b.c(str);
        if (lC2 != null) {
            return new GigShiftSnippetTimer(i12, lC2.longValue(), str2, str3, z12);
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:116:0x037a  */
    /* JADX WARN: Removed duplicated region for block: B:198:0x051a  */
    /* JADX WARN: Removed duplicated region for block: B:199:0x051c  */
    /* JADX WARN: Removed duplicated region for block: B:201:0x0526  */
    /* JADX WARN: Removed duplicated region for block: B:205:0x0530  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x02f8  */
    @Override // Y41.l
    @Y61.k
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.ArrayList invoke(@Y61.k cQ0.e r38) throws android.content.res.Resources.NotFoundException {
        /*
            Method dump skipped, instructions count: 1368
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.work_profile.profile.gig.mvi.k.invoke(cQ0.e):java.util.ArrayList");
    }
}
