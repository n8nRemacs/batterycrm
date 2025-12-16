package com.avito.android.captcha;

import com.avito.android.captcha.p;
import com.avito.android.remote.captcha.model.CaptchaData;
import com.avito.android.remote.captcha.model.CaptchaType;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.s0;

/* compiled from: CaptchaMapper.kt */
@s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/captcha/u;", "", "<init>", "()V", "_avito-discouraged_avito-libs_captcha"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class u {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public static final u f115136a = new u();

    /* compiled from: CaptchaMapper.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ kotlin.enums.a<CaptchaType> f115137a = kotlin.enums.c.a(CaptchaType.values());
    }

    /* compiled from: CaptchaMapper.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class b {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f115138a;

        static {
            int[] iArr = new int[CaptchaType.values().length];
            try {
                iArr[CaptchaType.H_CAPTCHA.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[CaptchaType.GEETEST.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[CaptchaType.AVITO_CAPTCHA.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[CaptchaType.f253318b.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            f115138a = iArr;
        }
    }

    @Y61.k
    public static p a(@Y61.l CaptchaData captchaData, boolean z12) {
        CaptchaType type = captchaData != null ? captchaData.getType() : null;
        int i12 = type == null ? -1 : b.f115138a[type.ordinal()];
        if (i12 != -1) {
            if (i12 == 1) {
                return p.c.f115124b;
            }
            if (i12 == 2) {
                return p.b.f115123b;
            }
            if (i12 == 3) {
                return new p.a(z12 ? null : captchaData.getImage(), captchaData.getMessage());
            }
            if (i12 != 4) {
                throw new NoWhenBranchMatchedException();
            }
        }
        return p.d.f115125b;
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x0051  */
    @Y61.k
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static com.avito.android.captcha.p b(@Y61.l java.util.Map r5, boolean r6) {
        /*
            r0 = 0
            if (r5 == 0) goto La
            java.lang.String r1 = "type"
            java.lang.Object r1 = r5.get(r1)
            goto Lb
        La:
            r1 = r0
        Lb:
            kotlin.enums.a<com.avito.android.remote.captcha.model.CaptchaType> r2 = com.avito.android.captcha.u.a.f115137a
            kotlin.collections.c r2 = (kotlin.collections.AbstractC42738c) r2
            java.util.Iterator r2 = r2.iterator()
        L13:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L2b
            java.lang.Object r3 = r2.next()
            r4 = r3
            com.avito.android.remote.captcha.model.CaptchaType r4 = (com.avito.android.remote.captcha.model.CaptchaType) r4
            java.lang.String r4 = r4.toString()
            boolean r4 = r4.equals(r1)
            if (r4 == 0) goto L13
            goto L2c
        L2b:
            r3 = r0
        L2c:
            com.avito.android.remote.captcha.model.CaptchaType r3 = (com.avito.android.remote.captcha.model.CaptchaType) r3
            if (r3 != 0) goto L32
            com.avito.android.remote.captcha.model.CaptchaType r3 = com.avito.android.remote.captcha.model.CaptchaType.f253318b
        L32:
            int[] r1 = com.avito.android.captcha.u.b.f115138a
            int r2 = r3.ordinal()
            r1 = r1[r2]
            r2 = 1
            if (r1 == r2) goto L7d
            r2 = 2
            if (r1 == r2) goto L7a
            r2 = 3
            if (r1 == r2) goto L4f
            r5 = 4
            if (r1 != r5) goto L49
            com.avito.android.captcha.p$d r5 = com.avito.android.captcha.p.d.f115125b
            goto L7f
        L49:
            kotlin.NoWhenBranchMatchedException r5 = new kotlin.NoWhenBranchMatchedException
            r5.<init>()
            throw r5
        L4f:
            if (r6 == 0) goto L53
        L51:
            r6 = r0
            goto L63
        L53:
            if (r5 == 0) goto L5c
            java.lang.String r6 = "message"
            java.lang.Object r6 = r5.get(r6)
            goto L5d
        L5c:
            r6 = r0
        L5d:
            boolean r1 = r6 instanceof java.lang.String
            if (r1 == 0) goto L51
            java.lang.String r6 = (java.lang.String) r6
        L63:
            if (r5 == 0) goto L6c
            java.lang.String r1 = "image"
            java.lang.Object r5 = r5.get(r1)
            goto L6d
        L6c:
            r5 = r0
        L6d:
            boolean r1 = r5 instanceof java.lang.String
            if (r1 == 0) goto L74
            r0 = r5
            java.lang.String r0 = (java.lang.String) r0
        L74:
            com.avito.android.captcha.p$a r5 = new com.avito.android.captcha.p$a
            r5.<init>(r0, r6)
            goto L7f
        L7a:
            com.avito.android.captcha.p$b r5 = com.avito.android.captcha.p.b.f115123b
            goto L7f
        L7d:
            com.avito.android.captcha.p$c r5 = com.avito.android.captcha.p.c.f115124b
        L7f:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.captcha.u.b(java.util.Map, boolean):com.avito.android.captcha.p");
    }
}
