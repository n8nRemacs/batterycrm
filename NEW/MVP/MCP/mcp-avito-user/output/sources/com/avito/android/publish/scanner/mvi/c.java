package com.avito.android.publish.scanner.mvi;

import Y41.l;
import com.avito.android.remote.model.imei_recognition.ImeiRecognitionResult;
import com.avito.android.util.P2;
import kotlin.Metadata;
import kotlin.jvm.internal.N;
import ze0.InterfaceC50554b;

/* compiled from: ScannerActor.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "message", "Lze0/b$d;", "invoke", "(Ljava/lang/String;)Lze0/b$d;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes16.dex */
final class c extends N implements l<String, InterfaceC50554b.d> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ P2<ImeiRecognitionResult> f239248l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public c(P2<? super ImeiRecognitionResult> p22) {
        super(1);
        this.f239248l = p22;
    }

    @Override // Y41.l
    public final InterfaceC50554b.d invoke(String str) {
        return new InterfaceC50554b.d(((P2.a) this.f239248l).f318719a, str);
    }
}
