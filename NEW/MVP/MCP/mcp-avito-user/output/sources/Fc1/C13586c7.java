package Fc1;

import androidx.compose.ui.text.C22602e;
import kotlin.collections.C42745f0;

@kotlin.jvm.internal.s0
/* renamed from: Fc1.c7, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C13586c7 extends kotlin.jvm.internal.N implements Y41.l<Integer, kotlin.G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ C22602e f5442l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ Y41.l<String, kotlin.G0> f5443m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C13586c7(Y41.l lVar, C22602e c22602e) {
        super(1);
        this.f5442l = c22602e;
        this.f5443m = lVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // Y41.l
    public final kotlin.G0 invoke(Integer num) {
        int iIntValue = num.intValue();
        C22602e.C1684e c1684e = (C22602e.C1684e) C42745f0.G(this.f5442l.c(iIntValue, iIntValue, "url_tag"));
        if (c1684e != null) {
            this.f5443m.invoke(c1684e.f42138a);
        }
        return kotlin.G0.f406611a;
    }
}
