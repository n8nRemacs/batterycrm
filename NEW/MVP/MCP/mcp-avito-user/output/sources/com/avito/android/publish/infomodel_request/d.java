package com.avito.android.publish.infomodel_request;

import android.os.Bundle;
import androidx.view.InterfaceC23040h0;
import com.avito.android.util.C35966w1;
import kotlin.G0;
import kotlin.InterfaceC43072x;
import kotlin.Metadata;
import kotlin.jvm.internal.D;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.N;

/* compiled from: InfomodelRequestFragment.kt */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"_avito_publish_impl"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class d {

    /* compiled from: InfomodelRequestFragment.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroid/os/Bundle;", "Lkotlin/G0;", "invoke", "(Landroid/os/Bundle;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a extends N implements Y41.l<Bundle, G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ boolean f236096l;

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ boolean f236097m;

        /* renamed from: n, reason: collision with root package name */
        public final /* synthetic */ String f236098n;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(boolean z12, boolean z13, String str) {
            super(1);
            this.f236096l = z12;
            this.f236097m = z13;
            this.f236098n = str;
        }

        @Override // Y41.l
        public final G0 invoke(Bundle bundle) {
            Bundle bundle2 = bundle;
            bundle2.putBoolean("is_initial_request", this.f236096l);
            bundle2.putBoolean("track_draft_resumed", this.f236097m);
            bundle2.putString("draft_id", this.f236098n);
            return G0.f406611a;
        }
    }

    /* compiled from: InfomodelRequestFragment.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class b implements InterfaceC23040h0, D {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Y41.l f236099b;

        public b(Y41.l lVar) {
            this.f236099b = lVar;
        }

        public final boolean equals(@Y61.l Object obj) {
            if ((obj instanceof InterfaceC23040h0) && (obj instanceof D)) {
                return L.f(this.f236099b, ((D) obj).getFunctionDelegate());
            }
            return false;
        }

        @Override // kotlin.jvm.internal.D
        @Y61.k
        public final InterfaceC43072x<?> getFunctionDelegate() {
            return this.f236099b;
        }

        public final int hashCode() {
            return this.f236099b.hashCode();
        }

        @Override // androidx.view.InterfaceC23040h0
        public final /* synthetic */ void onChanged(Object obj) {
            this.f236099b.invoke(obj);
        }
    }

    @Y61.k
    public static final InfomodelRequestFragment a(@Y61.k String str, boolean z12, boolean z13) {
        InfomodelRequestFragment infomodelRequestFragment = new InfomodelRequestFragment();
        C35966w1.a(infomodelRequestFragment, -1, new a(z12, z13, str));
        return infomodelRequestFragment;
    }
}
