package com.avito.android.verification.common;

import Y61.k;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.remote.model.common.VerificationAction;
import com.avito.android.remote.model.common.items.VerificationBannerItem;
import com.avito.android.remote.model.common.items.VerificationIconItem;
import com.avito.android.remote.model.common.items.VerificationImageItem;
import com.avito.android.remote.model.common.items.VerificationListItem;
import com.avito.android.remote.model.common.items.VerificationSpacerItem;
import com.avito.android.remote.model.common.items.VerificationStatusItem;
import com.avito.android.remote.model.common.items.VerificationTextItem;
import com.avito.android.remote.model.text.AttributedText;
import com.avito.android.util.y6;
import com.avito.android.verification.common.list.modern_status.ModernStatusItem;
import com.avito.android.verification.common.list.verification_group.VerificationGroupItem;
import com.avito.android.verification.list_items.image.ImageItem;
import com.avito.android.verification.list_items.verification_status.VerificationStatusItemState;
import java.util.UUID;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.C42784z0;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;

/* compiled from: VerificationListItemConverter.kt */
@s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/verification/common/a;", "", "<init>", "()V", "_avito_verification_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class a {

    /* compiled from: VerificationListItemConverter.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.verification.common.a$a, reason: collision with other inner class name */
    public /* synthetic */ class C9997a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f323389a;

        /* renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ int[] f323390b;

        /* renamed from: c, reason: collision with root package name */
        public static final /* synthetic */ int[] f323391c;

        static {
            int[] iArr = new int[VerificationStatusItem.Style.values().length];
            try {
                iArr[VerificationStatusItem.Style.GROUPS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[VerificationStatusItem.Style.MODERN.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f323389a = iArr;
            int[] iArr2 = new int[VerificationStatusItem.State.values().length];
            try {
                iArr2[VerificationStatusItem.State.PENDING.ordinal()] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr2[VerificationStatusItem.State.FAILURE.ordinal()] = 2;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[VerificationStatusItem.State.SUCCESS.ordinal()] = 3;
            } catch (NoSuchFieldError unused5) {
            }
            f323390b = iArr2;
            int[] iArr3 = new int[VerificationImageItem.Align.values().length];
            try {
                iArr3[VerificationImageItem.Align.RIGHT.ordinal()] = 1;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr3[VerificationImageItem.Align.CENTER.ordinal()] = 2;
            } catch (NoSuchFieldError unused7) {
            }
            f323391c = iArr3;
        }
    }

    @Inject
    public a() {
    }

    @k
    public static com.avito.conveyor_item.a a(@k VerificationListItem verificationListItem) {
        com.avito.conveyor_item.a imageItem;
        int i12;
        if (verificationListItem instanceof VerificationStatusItem) {
            VerificationStatusItem verificationStatusItem = (VerificationStatusItem) verificationListItem;
            VerificationStatusItem.Style style = verificationStatusItem.getStyle();
            int i13 = style == null ? -1 : C9997a.f323389a[style.ordinal()];
            if (i13 != 1) {
                if (i13 == 2) {
                    String title = verificationStatusItem.getTitle();
                    String strValueOf = String.valueOf(title != null ? title.hashCode() : 0);
                    String title2 = verificationStatusItem.getTitle();
                    String str = title2 != null ? title2 : "";
                    AttributedText body = verificationStatusItem.getBody();
                    if (body == null) {
                        body = new AttributedText("", C42784z0.f406748b, 0, 4, null);
                    }
                    AttributedText attributedText = body;
                    VerificationStatusItem.State state = verificationStatusItem.getState();
                    i12 = state != null ? C9997a.f323390b[state.ordinal()] : -1;
                    ModernStatusItem.Status status = i12 != 1 ? i12 != 2 ? i12 != 3 ? ModernStatusItem.Status.f323421b : ModernStatusItem.Status.f323423d : ModernStatusItem.Status.f323424e : ModernStatusItem.Status.f323422c;
                    VerificationAction action = verificationStatusItem.getAction();
                    return new ModernStatusItem(strValueOf, str, attributedText, status, action != null ? action.getUri() : null, verificationStatusItem.getImage());
                }
                String title3 = verificationStatusItem.getTitle();
                int iHashCode = title3 != null ? title3.hashCode() : 0;
                AttributedText body2 = verificationStatusItem.getBody();
                String strValueOf2 = String.valueOf(iHashCode + (body2 != null ? body2.hashCode() : 0));
                String title4 = verificationStatusItem.getTitle();
                String str2 = title4 == null ? "" : title4;
                AttributedText body3 = verificationStatusItem.getBody();
                VerificationAction action2 = verificationStatusItem.getAction();
                String title5 = action2 != null ? action2.getTitle() : null;
                VerificationStatusItem.State state2 = verificationStatusItem.getState();
                i12 = state2 != null ? C9997a.f323390b[state2.ordinal()] : -1;
                VerificationStatusItemState verificationStatusItemState = i12 != 1 ? i12 != 2 ? i12 != 3 ? VerificationStatusItemState.f324849d : VerificationStatusItemState.f324852g : VerificationStatusItemState.f324851f : VerificationStatusItemState.f324850e;
                VerificationAction action3 = verificationStatusItem.getAction();
                DeepLink uri = action3 != null ? action3.getUri() : null;
                VerificationAction action4 = verificationStatusItem.getAction();
                return new com.avito.android.verification.list_items.verification_status.a(strValueOf2, str2, verificationStatusItemState, body3, null, title5, uri, action4 != null ? L.f(action4.getIsDisabled(), Boolean.TRUE) : false, 16, null);
            }
            String title6 = verificationStatusItem.getTitle();
            int iHashCode2 = title6 != null ? title6.hashCode() : 0;
            AttributedText body4 = verificationStatusItem.getBody();
            String strValueOf3 = String.valueOf(iHashCode2 + (body4 != null ? body4.hashCode() : 0));
            String title7 = verificationStatusItem.getTitle();
            String str3 = title7 == null ? "" : title7;
            AttributedText body5 = verificationStatusItem.getBody();
            if (body5 == null) {
                body5 = new AttributedText("", C42784z0.f406748b, 0, 4, null);
            }
            AttributedText attributedText2 = body5;
            VerificationStatusItem.State state3 = verificationStatusItem.getState();
            i12 = state3 != null ? C9997a.f323390b[state3.ordinal()] : -1;
            VerificationGroupItem.Status status2 = i12 != 1 ? i12 != 2 ? i12 != 3 ? VerificationGroupItem.Status.f323454b : VerificationGroupItem.Status.f323456d : VerificationGroupItem.Status.f323457e : VerificationGroupItem.Status.f323455c;
            VerificationAction action5 = verificationStatusItem.getAction();
            imageItem = new VerificationGroupItem(strValueOf3, str3, attributedText2, status2, action5 != null ? action5.getUri() : null, verificationStatusItem.getImage());
        } else {
            if (verificationListItem instanceof VerificationTextItem) {
                VerificationTextItem verificationTextItem = (VerificationTextItem) verificationListItem;
                String strValueOf4 = String.valueOf(verificationTextItem.hashCode());
                AttributedText text = verificationTextItem.getText();
                if (text == null) {
                    text = new AttributedText("", C42784z0.f406748b, 0, 4, null);
                }
                return new com.avito.android.verification.list_items.attributed_text.a(strValueOf4, text, null, false, 12, null);
            }
            if (verificationListItem instanceof VerificationSpacerItem) {
                String string = UUID.randomUUID().toString();
                Integer height = ((VerificationSpacerItem) verificationListItem).getHeight();
                imageItem = new com.avito.android.verification.common.list.space.a(string, height != null ? y6.b(height.intValue()) : 0);
            } else {
                if (verificationListItem instanceof VerificationIconItem) {
                    VerificationIconItem verificationIconItem = (VerificationIconItem) verificationListItem;
                    return new com.avito.android.verification.list_items.icon_text.a(null, verificationIconItem.getTitle(), verificationIconItem.getBody(), verificationIconItem.getIcon(), 1, null);
                }
                if (!(verificationListItem instanceof VerificationImageItem)) {
                    if (!(verificationListItem instanceof VerificationBannerItem)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    VerificationBannerItem verificationBannerItem = (VerificationBannerItem) verificationListItem;
                    return new com.avito.android.verification.list_items.banner.a(null, verificationBannerItem.getTitle(), verificationBannerItem.getBody(), verificationBannerItem.getStyle(), verificationBannerItem.getBackgroundColor(), 0, 0, 97, null);
                }
                VerificationImageItem verificationImageItem = (VerificationImageItem) verificationListItem;
                Integer width = verificationImageItem.getWidth();
                int iB2 = width != null ? y6.b(width.intValue()) : y6.b(60);
                Integer height2 = verificationImageItem.getHeight();
                int iB3 = height2 != null ? y6.b(height2.intValue()) : y6.b(60);
                VerificationImageItem.Align align = verificationImageItem.getAlign();
                i12 = align != null ? C9997a.f323391c[align.ordinal()] : -1;
                imageItem = new ImageItem(null, iB2, iB3, i12 != 1 ? i12 != 2 ? ImageItem.Align.f324817b : ImageItem.Align.f324819d : ImageItem.Align.f324818c, verificationImageItem.getImage(), 1, null);
            }
        }
        return imageItem;
    }
}
