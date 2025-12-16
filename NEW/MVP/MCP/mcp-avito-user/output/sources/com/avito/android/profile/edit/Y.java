package com.avito.android.profile.edit;

import com.avito.android.remote.model.Sublocation;
import java.util.Iterator;
import java.util.List;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;

/* compiled from: LocationInteractor.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"", "Lcom/avito/android/remote/model/Sublocation;", "locations", "Lkotlin/G0;", "apply", "(Ljava/util/List;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes16.dex */
final class Y<T, R> implements l41.o {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ b0 f222015b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Sublocation.Type f222016c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ String f222017d;

    public Y(b0 b0Var, Sublocation.Type type, String str) {
        this.f222015b = b0Var;
        this.f222016c = type;
        this.f222017d = str;
    }

    @Override // l41.o
    public final Object apply(Object obj) {
        String direction;
        List<? extends Sublocation> list = (List) obj;
        b0 b0Var = this.f222015b;
        b0Var.getClass();
        Sublocation.Type type = this.f222016c;
        boolean z12 = type instanceof Sublocation.Type.Metro;
        d0 d0Var = b0Var.f222070d;
        if (z12) {
            direction = d0Var.b();
        } else if (type instanceof Sublocation.Type.District) {
            direction = d0Var.a();
        } else {
            if (!(type instanceof Sublocation.Type.Direction)) {
                throw new NoWhenBranchMatchedException();
            }
            direction = d0Var.getDirection();
        }
        String str = this.f222017d;
        Sublocation sublocation = null;
        if (str != null) {
            Iterator<T> it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                T next = it.next();
                if (kotlin.jvm.internal.L.f(((Sublocation) next).getId(), str)) {
                    sublocation = next;
                    break;
                }
            }
            sublocation = sublocation;
        }
        b0Var.f222072f = b0Var.f222072f;
        b0Var.f222073g = type;
        b0Var.f222074h = sublocation;
        b0Var.f222075i = list;
        b0Var.f222076j = direction;
        return G0.f406611a;
    }
}
