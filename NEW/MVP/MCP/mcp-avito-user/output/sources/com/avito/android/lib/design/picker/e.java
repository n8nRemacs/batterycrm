package com.avito.android.lib.design.picker;

import Y41.p;
import java.util.List;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: Picker.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u00032\f\u0010\u0001\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u00002\f\u0010\u0002\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lcom/avito/android/lib/design/picker/k;", "first", "second", "Lkotlin/G0;", "invoke", "(Lcom/avito/android/lib/design/picker/k;Lcom/avito/android/lib/design/picker/k;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes14.dex */
final class e extends N implements p<k<?>, k<?>, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ List<k<?>> f180004l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ int f180005m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ Picker f180006n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ k<?> f180007o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ List<k<?>> f180008p;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ int f180009q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ k<?> f180010r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(List list, int i12, Picker picker, k kVar, List list2, int i13, k kVar2) {
        super(2);
        this.f180004l = list;
        this.f180005m = i12;
        this.f180006n = picker;
        this.f180007o = kVar;
        this.f180008p = list2;
        this.f180009q = i13;
        this.f180010r = kVar2;
    }

    @Override // Y41.p
    public final G0 invoke(k<?> kVar, k<?> kVar2) {
        k<?> kVar3 = kVar;
        k<?> kVar4 = kVar2;
        List<k<?>> list = this.f180004l;
        int iIndexOf = list.indexOf(kVar4);
        int i12 = this.f180005m;
        if (iIndexOf >= i12) {
            int iIndexOf2 = list.indexOf(kVar4);
            Picker picker = this.f180006n;
            if (iIndexOf2 > i12) {
                picker.i(1, this.f180007o);
            }
            if (this.f180008p.indexOf(kVar3) > this.f180009q) {
                picker.postDelayed(new c(picker, this.f180010r, 1), picker.f179982f);
            }
        }
        return G0.f406611a;
    }
}
