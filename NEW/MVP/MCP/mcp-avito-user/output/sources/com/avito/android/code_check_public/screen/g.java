package com.avito.android.code_check_public.screen;

import Y41.p;
import Y61.k;
import Y61.l;
import com.avito.android.code_check_public.model.Phone;
import java.util.ArrayList;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;
import kotlinx.coroutines.flow.InterfaceC43160i;
import kv.C43501a;

/* compiled from: PreRequest.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/code_check_public/screen/g;", "Lcom/avito/android/code_check_public/screen/h;", "a", "_avito_code-check_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class g implements h {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final String f119380a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final i f119381b;

    /* renamed from: c, reason: collision with root package name */
    @l
    public final Y41.l<Phone, G0> f119382c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final a f119383d;

    /* renamed from: e, reason: collision with root package name */
    @l
    public final p<C43501a, Continuation<? super To.d>, Object> f119384e;

    /* compiled from: PreRequest.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b&\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/code_check_public/screen/g$a;", "Lcom/avito/android/code_check_public/screen/f;", "<init>", "()V", "_avito_code-check_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static abstract class a extends f {
        @k
        public abstract InterfaceC43160i b(@l String str, @l ArrayList arrayList);
    }

    public g() {
        throw null;
    }

    public g(String str, i iVar, Y41.l lVar, a aVar, p pVar, int i12, C42822w c42822w) {
        iVar = (i12 & 2) != 0 ? new i(null, null, null, null, 15, null) : iVar;
        lVar = (i12 & 4) != 0 ? null : lVar;
        pVar = (i12 & 16) != 0 ? null : pVar;
        this.f119380a = str;
        this.f119381b = iVar;
        this.f119382c = lVar;
        this.f119383d = aVar;
        this.f119384e = pVar;
    }

    @Override // com.avito.android.code_check_public.screen.h
    @k
    /* renamed from: U, reason: from getter */
    public final i getF119381b() {
        return this.f119381b;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        return L.f(this.f119380a, gVar.f119380a) && L.f(this.f119381b, gVar.f119381b) && L.f(this.f119382c, gVar.f119382c) && L.f(this.f119383d, gVar.f119383d) && L.f(this.f119384e, gVar.f119384e);
    }

    @Override // com.avito.android.code_check_public.screen.h
    @k
    /* renamed from: getName, reason: from getter */
    public final String getF119380a() {
        return this.f119380a;
    }

    public final int hashCode() {
        int iHashCode = (this.f119381b.hashCode() + (this.f119380a.hashCode() * 31)) * 31;
        Y41.l<Phone, G0> lVar = this.f119382c;
        int iHashCode2 = (this.f119383d.hashCode() + ((iHashCode + (lVar == null ? 0 : lVar.hashCode())) * 31)) * 31;
        p<C43501a, Continuation<? super To.d>, Object> pVar = this.f119384e;
        return iHashCode2 + (pVar != null ? pVar.hashCode() : 0);
    }

    @k
    public final String toString() {
        return "PreRequest(name=" + this.f119380a + ", navigation=" + this.f119381b + ", opener=" + this.f119382c + ", interactor=" + this.f119383d + ", deeplinkResultMapper=" + this.f119384e + ')';
    }
}
