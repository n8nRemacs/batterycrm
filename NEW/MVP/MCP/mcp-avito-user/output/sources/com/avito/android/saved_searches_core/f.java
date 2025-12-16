package com.avito.android.saved_searches_core;

import Io0.InterfaceC14138a;
import Jo0.C14230a;
import Jo0.C14231b;
import Jo0.C14232c;
import Lo0.C14424b;
import Y41.p;
import Y61.k;
import Y61.l;
import com.avito.android.messenger.blacklist.mvi.C31685o;
import com.avito.android.remote.model.TypedResult;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.s0;
import kotlin.text.C43066x;
import kotlinx.coroutines.T;

/* compiled from: SavedSearchesInteractorImpl.kt */
@s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/T;", "Lcom/avito/android/remote/model/TypedResult;", "LJo0/c;", "<anonymous>", "(Lkotlinx/coroutines/T;)Lcom/avito/android/remote/model/TypedResult;"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.saved_searches_core.SavedSearchesInteractorImpl$updateSearchSubscription$2", f = "SavedSearchesInteractorImpl.kt", i = {}, l = {42}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes3.dex */
final class f extends SuspendLambda implements p<T, Continuation<? super TypedResult<C14232c>>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f258796q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ g f258797r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ String f258798s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ C14424b f258799t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ C14424b f258800u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ boolean f258801v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ Boolean f258802w;

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ boolean f258803x;

    /* renamed from: y, reason: collision with root package name */
    public final /* synthetic */ String f258804y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(g gVar, String str, C14424b c14424b, C14424b c14424b2, boolean z12, Boolean bool, boolean z13, String str2, Continuation<? super f> continuation) {
        super(2, continuation);
        this.f258797r = gVar;
        this.f258798s = str;
        this.f258799t = c14424b;
        this.f258800u = c14424b2;
        this.f258801v = z12;
        this.f258802w = bool;
        this.f258803x = z13;
        this.f258804y = str2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @k
    public final Continuation<G0> create(@l Object obj, @k Continuation<?> continuation) {
        return new f(this.f258797r, this.f258798s, this.f258799t, this.f258800u, this.f258801v, this.f258802w, this.f258803x, this.f258804y, continuation);
    }

    @Override // Y41.p
    public final Object invoke(T t12, Continuation<? super TypedResult<C14232c>> continuation) {
        return ((f) create(t12, continuation)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @l
    public final Object invokeSuspend(@k Object obj) {
        C14230a c14230a;
        C14231b c14231b;
        ArrayList arrayList;
        ArrayList arrayList2;
        ArrayList arrayList3;
        ArrayList arrayList4;
        ArrayList arrayList5;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f258796q;
        if (i12 != 0) {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C42729a0.b(obj);
            return obj;
        }
        C42729a0.b(obj);
        InterfaceC14138a interfaceC14138a = this.f258797r.f258805a;
        Long lZ02 = C43066x.z0(this.f258798s);
        long jLongValue = lZ02 != null ? lZ02.longValue() : -1L;
        ArrayList arrayList6 = null;
        C14424b c14424b = this.f258799t;
        if (c14424b != null) {
            List<String> list = c14424b.f10123a;
            if (list != null) {
                List<String> list2 = list;
                arrayList3 = new ArrayList(C42745f0.q(list2, 10));
                Iterator<T> it = list2.iterator();
                while (it.hasNext()) {
                    C31685o.q((String) it.next(), arrayList3);
                }
            } else {
                arrayList3 = null;
            }
            List<String> list3 = c14424b.f10124b;
            if (list3 != null) {
                List<String> list4 = list3;
                arrayList4 = new ArrayList(C42745f0.q(list4, 10));
                Iterator<T> it2 = list4.iterator();
                while (it2.hasNext()) {
                    C31685o.q((String) it2.next(), arrayList4);
                }
            } else {
                arrayList4 = null;
            }
            List<String> list5 = c14424b.f10125c;
            if (list5 != null) {
                List<String> list6 = list5;
                arrayList5 = new ArrayList(C42745f0.q(list6, 10));
                Iterator<T> it3 = list6.iterator();
                while (it3.hasNext()) {
                    C31685o.q((String) it3.next(), arrayList5);
                }
            } else {
                arrayList5 = null;
            }
            c14230a = new C14230a(arrayList3, arrayList4, arrayList5);
        } else {
            c14230a = null;
        }
        C14424b c14424b2 = this.f258800u;
        if (c14424b2 != null) {
            List<String> list7 = c14424b2.f10123a;
            if (list7 != null) {
                List<String> list8 = list7;
                arrayList = new ArrayList(C42745f0.q(list8, 10));
                Iterator<T> it4 = list8.iterator();
                while (it4.hasNext()) {
                    C31685o.q((String) it4.next(), arrayList);
                }
            } else {
                arrayList = null;
            }
            List<String> list9 = c14424b2.f10124b;
            if (list9 != null) {
                List<String> list10 = list9;
                arrayList2 = new ArrayList(C42745f0.q(list10, 10));
                Iterator<T> it5 = list10.iterator();
                while (it5.hasNext()) {
                    C31685o.q((String) it5.next(), arrayList2);
                }
            } else {
                arrayList2 = null;
            }
            List<String> list11 = c14424b2.f10125c;
            if (list11 != null) {
                List<String> list12 = list11;
                arrayList6 = new ArrayList(C42745f0.q(list12, 10));
                Iterator<T> it6 = list12.iterator();
                while (it6.hasNext()) {
                    C31685o.q((String) it6.next(), arrayList6);
                }
            }
            c14231b = new C14231b(arrayList, arrayList2, arrayList6);
        } else {
            c14231b = null;
        }
        Jo0.d dVar = new Jo0.d(c14230a, Boxing.boxBoolean(this.f258801v), this.f258802w, Boxing.boxBoolean(this.f258803x), Boxing.boxBoolean(true), c14231b, this.f258804y);
        this.f258796q = 1;
        Object objA = interfaceC14138a.a(jLongValue, dVar, this);
        return objA == coroutine_suspended ? coroutine_suspended : objA;
    }
}
