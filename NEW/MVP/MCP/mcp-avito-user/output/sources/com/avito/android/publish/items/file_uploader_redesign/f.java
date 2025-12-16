package com.avito.android.publish.items.file_uploader_redesign;

import androidx.compose.runtime.internal.P;
import com.avito.android.category_parameters.ParameterElement;
import com.avito.android.mandatory_verification.items.uploader.m;
import com.avito.android.util.R0;
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.collections.C42784z0;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.Q0;
import kotlinx.coroutines.U;
import kotlinx.coroutines.flow.e2;
import kotlinx.coroutines.flow.f2;
import kotlinx.coroutines.internal.C43238h;

/* compiled from: FileUploaderRedesignItemPresenter.kt */
@P
@s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/publish/items/file_uploader_redesign/f;", "Lcom/avito/android/publish/items/file_uploader_redesign/e;", "a", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class f implements e {

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public static final a f236835e = new a(null);

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final e2 f236836b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final e2 f236837c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final C43238h f236838d;

    /* compiled from: FileUploaderRedesignItemPresenter.kt */
    @s0
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lcom/avito/android/publish/items/file_uploader_redesign/f$a;", "", "<init>", "()V", "", "BOTTOM_MARGIN", "I", "", "BUTTON_STYLE_SECONDARY", "Ljava/lang/String;", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    @Inject
    public f(@Y61.k R0 r02) {
        e2 e2VarB = f2.b(0, 0, null, 7);
        this.f236836b = e2VarB;
        this.f236837c = e2VarB;
        this.f236838d = U.a(r02.b());
    }

    /* JADX WARN: Removed duplicated region for block: B:61:0x00bb A[PHI: r1
  0x00bb: PHI (r1v22 java.lang.String) = (r1v11 java.lang.String), (r1v23 java.lang.String) binds: [B:63:0x00bf, B:59:0x00b8] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00bd  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static com.avito.android.mandatory_verification.items.uploader.MandatoryVerificationUploaderItem k(com.avito.android.category_parameters.ParameterElement.l r21, java.util.List r22) {
        /*
            Method dump skipped, instructions count: 284
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.publish.items.file_uploader_redesign.f.k(com.avito.android.category_parameters.ParameterElement$l, java.util.List):com.avito.android.mandatory_verification.items.uploader.MandatoryVerificationUploaderItem");
    }

    @Override // TX.a
    @Y61.k
    /* renamed from: F, reason: from getter */
    public final e2 getF236837c() {
        return this.f236837c;
    }

    @Override // TV0.d
    public final void O5(TV0.e eVar, TV0.a aVar, int i12) {
        ParameterElement.l lVar = (ParameterElement.l) aVar;
        ((m) eVar).aG(k(lVar, C42784z0.f406748b), new h(this, lVar), new j(this));
    }

    @Override // TV0.f
    public final void g2(TV0.e eVar, TV0.a aVar, int i12, List list) {
        ParameterElement.l lVar = (ParameterElement.l) aVar;
        ((m) eVar).aG(k(lVar, list), new h(this, lVar), new j(this));
    }

    @Override // TX.a
    public final void j5() {
        Q0.d(this.f236838d.f411905b);
    }
}
