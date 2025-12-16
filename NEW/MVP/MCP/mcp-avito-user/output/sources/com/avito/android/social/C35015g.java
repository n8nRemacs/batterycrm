package com.avito.android.social;

import android.content.Intent;
import android.os.Build;
import android.os.Parcelable;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.social.D;
import com.avito.android.social.I;
import com.avito.android.social.esia.EsiaAuthActivity;
import com.avito.android.social.esia.EsiaAuthResult;
import com.avito.android.util.C35974x2;
import com.avito.android.util.V2;
import com.esiasdk.android.esiaLoginClient.TokenParameters;
import javax.inject.Inject;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.s0;

/* compiled from: EsiaSignInManager.kt */
@s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/social/g;", "Lcom/avito/android/social/f;", "a", "_common_social_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.avito.android.social.g, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C35015g implements InterfaceC35014f {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final InterfaceC28373a f284414a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.l
    public String f284415b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.l
    public String f284416c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.l
    public String f284417d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.l
    public String f284418e;

    /* compiled from: EsiaSignInManager.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/avito/android/social/g$a;", "", "<init>", "()V", "", "ESIA_REQUEST_CODE", "I", "_common_social_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.social.g$a */
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    static {
        new a(null);
    }

    @Inject
    public C35015g(@Y61.k InterfaceC28373a interfaceC28373a) {
        this.f284414a = interfaceC28373a;
    }

    @Override // com.avito.android.social.D
    @Y61.l
    /* renamed from: c, reason: from getter */
    public final String getF284415b() {
        return this.f284415b;
    }

    @Override // com.avito.android.social.D
    @Y61.l
    public final String d() {
        return null;
    }

    @Override // com.avito.android.social.D
    public final void e(@Y61.k SocialActivity socialActivity, @Y61.l Y41.l lVar) {
        EsiaAuthActivity.f284369e.getClass();
        Intent intent = new Intent(socialActivity, (Class<?>) EsiaAuthActivity.class);
        try {
            C35974x2.d(intent);
            socialActivity.startActivityForResult(intent, 709);
        } catch (Exception e12) {
            V2.f318762a.a("ESIA_SIGN_IN_MANAGER", "esia login exception", e12);
        }
    }

    @Override // com.avito.android.social.D
    public final boolean g(int i12, int i13, @Y61.l Intent intent, @Y61.l Y41.l<? super D.b, G0> lVar) {
        EsiaAuthResult esiaAuthResult;
        TokenParameters tokenParameters;
        TokenParameters tokenParameters2;
        if (i12 != 709) {
            return false;
        }
        if (intent != null) {
            esiaAuthResult = (EsiaAuthResult) (Build.VERSION.SDK_INT >= 33 ? (Parcelable) intent.getParcelableExtra("esia_app_2_app_result", EsiaAuthResult.class) : intent.getParcelableExtra("esia_app_2_app_result"));
        } else {
            esiaAuthResult = null;
        }
        if (esiaAuthResult == null) {
            if (i13 != -1) {
                if (i13 != 0) {
                    ((I.a) lVar).invoke(D.b.C8495b.f284270a);
                    return true;
                }
                ((I.a) lVar).invoke(D.b.a.f284269a);
                return true;
            }
            this.f284415b = intent != null ? intent.getStringExtra("esia_code") : null;
            this.f284416c = intent != null ? intent.getStringExtra("esia_state") : null;
            this.f284417d = intent != null ? intent.getStringExtra("esia_error") : null;
            stringExtra = intent != null ? intent.getStringExtra("esia_error_message") : null;
            this.f284418e = stringExtra;
            if (this.f284415b == null && (this.f284417d != null || stringExtra != null)) {
                this.f284415b = "";
            }
            ((I.a) lVar).invoke(D.b.c.f284271a);
            return true;
        }
        if (i13 == -1) {
            boolean z12 = esiaAuthResult instanceof EsiaAuthResult.Success;
            EsiaAuthResult.Success success = z12 ? (EsiaAuthResult.Success) esiaAuthResult : null;
            this.f284415b = (success == null || (tokenParameters2 = success.f284384b) == null) ? null : tokenParameters2.f339699b;
            EsiaAuthResult.Success success2 = z12 ? (EsiaAuthResult.Success) esiaAuthResult : null;
            if (success2 != null && (tokenParameters = success2.f284384b) != null) {
                stringExtra = tokenParameters.f339700c;
            }
            this.f284416c = stringExtra;
            ((I.a) lVar).invoke(D.b.c.f284271a);
            return true;
        }
        if (i13 != 0) {
            ((I.a) lVar).invoke(D.b.a.f284269a);
            return true;
        }
        ((I.a) lVar).invoke(D.b.C8495b.f284270a);
        boolean z13 = esiaAuthResult instanceof EsiaAuthResult.Canceled;
        InterfaceC28373a interfaceC28373a = this.f284414a;
        if (z13) {
            interfaceC28373a.c(new com.avito.android.social.esia.a("auth", "canceled: " + esiaAuthResult));
            return true;
        }
        interfaceC28373a.c(new com.avito.android.social.esia.a("auth", "failed: " + esiaAuthResult));
        return true;
    }

    @Override // com.avito.android.social.InterfaceC35014f
    @Y61.l
    /* renamed from: getError, reason: from getter */
    public final String getF284417d() {
        return this.f284417d;
    }

    @Override // com.avito.android.social.InterfaceC35014f
    @Y61.l
    /* renamed from: getErrorMessage, reason: from getter */
    public final String getF284418e() {
        return this.f284418e;
    }

    @Override // com.avito.android.social.InterfaceC35014f
    @Y61.l
    /* renamed from: getState, reason: from getter */
    public final String getF284416c() {
        return this.f284416c;
    }

    @Override // com.avito.android.social.InterfaceC35021m
    @Y61.k
    public final SocialType getType() {
        return SocialType.f284286i;
    }

    @Override // com.avito.android.social.D
    public final void a() {
    }
}
