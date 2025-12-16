package com.avito.android.verification.inn;

import com.avito.android.R;
import com.avito.android.lib.design.input.FormatterType;
import com.avito.android.remote.model.inn.items.VerificationButtonGroupItem;
import com.avito.android.remote.model.inn.items.VerificationButtonItem;
import com.avito.android.remote.model.inn.items.VerificationGroupItem;
import com.avito.android.remote.model.inn.items.VerificationInnItem;
import com.avito.android.remote.model.inn.items.VerificationInputKeyBoardType;
import com.avito.android.remote.model.inn.items.VerificationTextItem;
import com.avito.android.remote.model.text.AttributedText;
import java.util.List;
import java.util.Map;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.collections.P0;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.s0;

/* compiled from: VerificationInnListItemConverter.kt */
@s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/verification/inn/p;", "", "a", "_avito_verification_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class p {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.verification.inn.validation.b f324119a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final vM0.f f324120b;

    /* compiled from: VerificationInnListItemConverter.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0000X\u0080T¢\u0006\u0006\n\u0004\b\b\u0010\u0006¨\u0006\t"}, d2 = {"Lcom/avito/android/verification/inn/p$a;", "", "<init>", "()V", "", "FOOTER_ID", "Ljava/lang/String;", "SUBTITLE_ID", "TITLE_ID", "_avito_verification_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    /* compiled from: VerificationInnListItemConverter.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class b {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f324121a;

        /* renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ int[] f324122b;

        /* renamed from: c, reason: collision with root package name */
        public static final /* synthetic */ int[] f324123c;

        /* renamed from: d, reason: collision with root package name */
        public static final /* synthetic */ int[] f324124d;

        /* renamed from: e, reason: collision with root package name */
        public static final /* synthetic */ int[] f324125e;

        static {
            int[] iArr = new int[VerificationGroupItem.State.values().length];
            try {
                iArr[VerificationGroupItem.State.SUCCESS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[VerificationGroupItem.State.PENDING.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[VerificationGroupItem.State.FAILURE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f324121a = iArr;
            int[] iArr2 = new int[VerificationButtonGroupItem.VerificationButton.Style.values().length];
            try {
                iArr2[VerificationButtonGroupItem.VerificationButton.Style.PRIMARY.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[VerificationButtonGroupItem.VerificationButton.Style.DEFAULT.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr2[VerificationButtonGroupItem.VerificationButton.Style.SECONDARY.ordinal()] = 3;
            } catch (NoSuchFieldError unused6) {
            }
            f324122b = iArr2;
            int[] iArr3 = new int[VerificationButtonItem.Type.values().length];
            try {
                iArr3[VerificationButtonItem.Type.DEEPLINK.ordinal()] = 1;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr3[VerificationButtonItem.Type.BACK.ordinal()] = 2;
            } catch (NoSuchFieldError unused8) {
            }
            f324123c = iArr3;
            int[] iArr4 = new int[VerificationButtonItem.Style.values().length];
            try {
                iArr4[VerificationButtonItem.Style.DEFAULT.ordinal()] = 1;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr4[VerificationButtonItem.Style.SECONDARY.ordinal()] = 2;
            } catch (NoSuchFieldError unused10) {
            }
            f324124d = iArr4;
            int[] iArr5 = new int[VerificationInputKeyBoardType.values().length];
            try {
                iArr5[VerificationInputKeyBoardType.NUMERIC.ordinal()] = 1;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr5[VerificationInputKeyBoardType.PHONE_NUMBER.ordinal()] = 2;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                iArr5[VerificationInputKeyBoardType.DECIMAL.ordinal()] = 3;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                iArr5[VerificationInputKeyBoardType.EMAIL.ordinal()] = 4;
            } catch (NoSuchFieldError unused14) {
            }
            f324125e = iArr5;
        }
    }

    static {
        new a(null);
    }

    @Inject
    public p(@Y61.k com.avito.android.verification.inn.validation.b bVar, @Y61.k vM0.f fVar) {
        this.f324119a = bVar;
        this.f324120b = fVar;
    }

    public static /* synthetic */ List b(p pVar, List list, String str, AttributedText attributedText, int i12) {
        return pVar.a(list, (i12 & 2) != 0 ? null : str, (i12 & 4) != 0 ? null : attributedText, null, null);
    }

    public static FormatterType c(VerificationInputKeyBoardType verificationInputKeyBoardType) {
        int i12 = b.f324125e[verificationInputKeyBoardType.ordinal()];
        if (i12 == 1) {
            FormatterType.f179288e.getClass();
            return FormatterType.f179292i;
        }
        if (i12 == 2) {
            FormatterType.f179288e.getClass();
            return FormatterType.f179290g;
        }
        if (i12 == 3) {
            FormatterType.f179288e.getClass();
            return FormatterType.a.c();
        }
        if (i12 != 4) {
            FormatterType.f179288e.getClass();
            return FormatterType.f179289f;
        }
        FormatterType.f179288e.getClass();
        return FormatterType.f179294k;
    }

    public static com.avito.android.verification.inn.list.text.a d(VerificationTextItem verificationTextItem) {
        Integer marginBottom;
        Integer marginTop;
        Integer numA;
        Integer numQ;
        String id2 = verificationTextItem.getId();
        Map<String, Boolean> hiddenIf = verificationTextItem.getHiddenIf();
        if (hiddenIf == null) {
            hiddenIf = P0.c();
        }
        Map<String, Boolean> map = hiddenIf;
        AttributedText text = verificationTextItem.getText();
        String textStyle = verificationTextItem.getTextStyle();
        int iIntValue = (textStyle == null || (numQ = com.avito.android.lib.util.f.q(textStyle)) == null) ? R.attr.textM10 : numQ.intValue();
        String value = verificationTextItem.getValue();
        String textColor = verificationTextItem.getTextColor();
        int iIntValue2 = (textColor == null || (numA = com.avito.android.lib.util.e.a(textColor)) == null) ? R.attr.black : numA.intValue();
        VerificationInnItem.Style style = verificationTextItem.getStyle();
        int iIntValue3 = (style == null || (marginTop = style.getMarginTop()) == null) ? 0 : marginTop.intValue();
        VerificationInnItem.Style style2 = verificationTextItem.getStyle();
        return new com.avito.android.verification.inn.list.text.a(id2, map, null, iIntValue, text, value, iIntValue2, iIntValue3, (style2 == null || (marginBottom = style2.getMarginBottom()) == null) ? 0 : marginBottom.intValue(), 4, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:212:0x047c  */
    /* JADX WARN: Removed duplicated region for block: B:221:0x04a2  */
    /* JADX WARN: Removed duplicated region for block: B:227:0x04b7  */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v1, types: [com.avito.android.remote.model.text.AttributedText, java.lang.String] */
    /* JADX WARN: Type inference failed for: r5v95 */
    @Y61.k
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.ArrayList a(@Y61.k java.util.List r32, @Y61.l java.lang.String r33, @Y61.l com.avito.android.remote.model.text.AttributedText r34, @Y61.l kotlin.Q r35, @Y61.l com.avito.android.remote.model.text.AttributedText r36) {
        /*
            Method dump skipped, instructions count: 1855
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.verification.inn.p.a(java.util.List, java.lang.String, com.avito.android.remote.model.text.AttributedText, kotlin.Q, com.avito.android.remote.model.text.AttributedText):java.util.ArrayList");
    }
}
