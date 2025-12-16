package com.avito.android.social_management;

import com.avito.android.remote.model.social.SocialNetwork;
import com.avito.android.social.SocialType;
import java.util.Iterator;
import java.util.List;
import kotlin.G0;
import kotlin.Metadata;

/* compiled from: SocialManagementPresenter.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"", "Lcom/avito/android/remote/model/social/SocialNetwork;", "it", "Lkotlin/G0;", "invoke", "(Ljava/util/List;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes3.dex */
final class I extends kotlin.jvm.internal.N implements Y41.l<List<? extends SocialNetwork>, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ t f284442l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ String f284443m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public I(t tVar, String str) {
        super(1);
        this.f284442l = tVar;
        this.f284443m = str;
    }

    @Override // Y41.l
    public final G0 invoke(List<? extends SocialNetwork> list) {
        Q q12;
        Object next;
        t tVar = this.f284442l;
        tVar.getClass();
        String str = this.f284443m;
        boolean zF2 = kotlin.jvm.internal.L.f(str, "apple");
        M m12 = tVar.f284705i;
        if (zF2) {
            Q q13 = tVar.f284710n;
            if (q13 != null) {
                q13.e(com.avito.android.printable_text.b.f(m12.k()));
            }
        } else if (kotlin.jvm.internal.L.f(str, "gp") && (q12 = tVar.f284710n) != null) {
            q12.e(com.avito.android.printable_text.b.f(m12.e()));
        }
        SocialType socialTypeC = tVar.f284708l.c(str);
        Iterator<T> it = tVar.f284698b.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (((com.avito.android.social.D) next).getType() == socialTypeC) {
                break;
            }
        }
        com.avito.android.social.D d12 = (com.avito.android.social.D) next;
        if (d12 == null) {
            throw new IllegalArgumentException(AK.c.k("SocialNetwork type: ", str, " is not supported"));
        }
        d12.a();
        tVar.f284714r = null;
        tVar.g();
        return G0.f406611a;
    }
}
