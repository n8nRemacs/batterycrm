package com.avito.android.screens.bbip.ui.items.duration;

import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;

/* compiled from: DurationItemPresenter.kt */
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "durationItem", "Lkotlin/G0;", "invoke", "(Ljava/lang/String;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes3.dex */
final class f extends N implements Y41.l<String, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ h f260353l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ j f260354m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(h hVar, j jVar) {
        super(1);
        this.f260353l = hVar;
        this.f260354m = jVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v5, types: [java.lang.Object, java.util.List] */
    @Override // Y41.l
    public final G0 invoke(String str) throws NumberFormatException {
        String str2 = str;
        h hVar = this.f260353l;
        if (!str2.equals(hVar.f260359d)) {
            int i12 = 0;
            while (true) {
                if (i12 >= str2.length()) {
                    int i13 = Integer.parseInt(str2);
                    hVar.f260361f = i13;
                    hVar.f260357b.onNext(Integer.valueOf(i13));
                    break;
                }
                if (!Character.isDigit(str2.charAt(i12))) {
                    break;
                }
                i12++;
            }
        } else {
            ?? r52 = hVar.f260362g;
            int i14 = hVar.f260361f;
            j jVar = this.f260354m;
            jVar.Ys(r52, i14, new g(hVar, jVar));
        }
        return G0.f406611a;
    }
}
