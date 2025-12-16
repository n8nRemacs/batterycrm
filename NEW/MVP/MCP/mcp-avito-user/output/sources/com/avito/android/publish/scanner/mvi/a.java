package com.avito.android.publish.scanner.mvi;

import android.net.Uri;
import androidx.compose.runtime.internal.P;
import com.avito.android.arch.mvi.a;
import com.avito.android.publish.R0;
import com.avito.android.publish.analytics.InterfaceC33535v;
import com.avito.android.publish.di.W;
import com.avito.android.publish.scanner.ScannerParams;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.C43197r1;
import kotlinx.coroutines.flow.C43210w;
import kotlinx.coroutines.flow.InterfaceC43160i;
import kotlinx.coroutines.rx3.y;
import ze0.C50556d;
import ze0.InterfaceC50553a;
import ze0.InterfaceC50554b;

/* compiled from: ScannerActor.kt */
@P
@s0
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001¨\u0006\u0005"}, d2 = {"Lcom/avito/android/publish/scanner/mvi/a;", "Lcom/avito/android/arch/mvi/a;", "Lze0/a;", "Lze0/b;", "Lze0/d;", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class a implements com.avito.android.arch.mvi.a<InterfaceC50553a, InterfaceC50554b, C50556d> {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final R0 f239234a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.util.R0 f239235b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final InterfaceC33535v f239236c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final ScannerParams f239237d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.publish.scanner.di.c f239238e;

    /* renamed from: f, reason: collision with root package name */
    public final int f239239f;

    /* compiled from: ScannerActor.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.publish.scanner.mvi.a$a, reason: collision with other inner class name */
    public /* synthetic */ class C7194a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f239240a;

        static {
            int[] iArr = new int[ScannerParams.values().length];
            try {
                iArr[ScannerParams.f239140d.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            f239240a = iArr;
        }
    }

    @Inject
    public a(@Y61.k R0 r02, @Y61.k com.avito.android.util.R0 r03, @Y61.k InterfaceC33535v interfaceC33535v, @Y61.k ScannerParams scannerParams, @Y61.k com.avito.android.publish.scanner.di.c cVar, @W int i12) {
        this.f239234a = r02;
        this.f239235b = r03;
        this.f239236c = interfaceC33535v;
        this.f239237d = scannerParams;
        this.f239238e = cVar;
        this.f239239f = i12;
    }

    @Override // com.avito.android.arch.mvi.a
    @Y61.k
    public final InterfaceC43160i a(@Y61.k C43197r1 c43197r1, @Y61.k Y41.a aVar) {
        return a.C2701a.a(this, c43197r1, aVar);
    }

    @Override // com.avito.android.arch.mvi.a
    public final InterfaceC43160i<InterfaceC50554b> b(InterfaceC50553a interfaceC50553a, C50556d c50556d) {
        InterfaceC50553a interfaceC50553a2 = interfaceC50553a;
        if (interfaceC50553a2.equals(InterfaceC50553a.b.f444110a)) {
            return new C43210w(InterfaceC50554b.C12962b.f444116a);
        }
        if (!(interfaceC50553a2 instanceof InterfaceC50553a.c)) {
            if (interfaceC50553a2.equals(InterfaceC50553a.C12961a.f444109a)) {
                return new C43210w(InterfaceC50554b.a.f444115a);
            }
            if (interfaceC50553a2.equals(InterfaceC50553a.d.f444114a)) {
                return new C43210w(InterfaceC50554b.f.f444121a);
            }
            throw new NoWhenBranchMatchedException();
        }
        InterfaceC50553a.c cVar = (InterfaceC50553a.c) interfaceC50553a2;
        Uri uri = (Uri) C42745f0.E(cVar.f444111a);
        if (C7194a.f239240a[this.f239237d.ordinal()] != 1) {
            throw new NoWhenBranchMatchedException();
        }
        return C43175k.I(this.f239235b.a(), new b(y.a(this.f239234a.b(uri, cVar.f444112b, cVar.f444113c)), this));
    }
}
