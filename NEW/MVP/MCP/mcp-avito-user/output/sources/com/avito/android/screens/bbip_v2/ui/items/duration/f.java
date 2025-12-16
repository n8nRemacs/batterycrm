package com.avito.android.screens.bbip_v2.ui.items.duration;

import android.os.Bundle;
import androidx.compose.runtime.internal.P;
import com.avito.android.screens.bbip_v2.ui.items.duration.b;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.inject.Inject;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;

/* compiled from: BbipV2DurationItemPresenter.kt */
@P
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/screens/bbip_v2/ui/items/duration/f;", "Lcom/avito/android/screens/bbip_v2/ui/items/duration/e;", "_avito_bbip_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class f implements e {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final Y41.p<b.a, Boolean, G0> f261630b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f261631c;

    /* compiled from: BbipV2DurationItemPresenter.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "durationItem", "Lkotlin/G0;", "invoke", "(Ljava/lang/String;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a extends N implements Y41.l<String, G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ String f261632l;

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ f f261633m;

        /* renamed from: n, reason: collision with root package name */
        public final /* synthetic */ i f261634n;

        /* renamed from: o, reason: collision with root package name */
        public final /* synthetic */ b f261635o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(String str, f fVar, i iVar, b bVar) {
            super(1);
            this.f261632l = str;
            this.f261633m = fVar;
            this.f261634n = iVar;
            this.f261635o = bVar;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r0v6, types: [java.util.List<com.avito.android.screens.bbip_v2.ui.items.duration.b$a>] */
        /* JADX WARN: Type inference failed for: r0v7, types: [java.util.List] */
        /* JADX WARN: Type inference failed for: r0v8, types: [java.util.ArrayList] */
        /* JADX WARN: Type inference failed for: r2v9, types: [com.avito.android.screens.bbip_v2.ui.items.duration.i] */
        @Override // Y41.l
        public final G0 invoke(String str) throws NumberFormatException {
            Object next;
            ?? arrayList;
            String str2 = str;
            boolean zEquals = str2.equals(this.f261632l);
            b bVar = this.f261635o;
            f fVar = this.f261633m;
            if (zEquals) {
                if (fVar.f261631c) {
                    List<b.a> list = bVar.f261614c;
                    arrayList = new ArrayList();
                    for (Object obj : list) {
                        if (((b.a) obj).f261625g == null) {
                            arrayList.add(obj);
                        }
                    }
                } else {
                    arrayList = bVar.f261614c;
                }
                this.f261634n.pf(bVar.f261616e, bVar.f261617f, arrayList, new g(1, fVar, f.class, "invokeListener", "invokeListener(Lcom/avito/android/screens/bbip_v2/ui/items/duration/BbipV2DurationItem$Duration;)V", 0));
            } else {
                boolean z12 = false;
                int i12 = 0;
                while (true) {
                    if (i12 >= str2.length()) {
                        int i13 = Integer.parseInt(str2);
                        Iterator it = bVar.f261614c.iterator();
                        while (true) {
                            if (!it.hasNext()) {
                                next = null;
                                break;
                            }
                            next = it.next();
                            if (((b.a) next).f261619a == i13) {
                                break;
                            }
                        }
                        b.a aVar = (b.a) next;
                        if (aVar != null) {
                            if (fVar.f261631c && aVar.f261625g != null) {
                                z12 = true;
                            }
                            fVar.f261630b.invoke(aVar, Boolean.valueOf(z12));
                        }
                    } else {
                        if (!Character.isDigit(str2.charAt(i12))) {
                            break;
                        }
                        i12++;
                    }
                }
            }
            return G0.f406611a;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Inject
    public f(@hh.g @Y61.k Y41.p<? super b.a, ? super Boolean, G0> pVar) {
        this.f261630b = pVar;
    }

    @Override // TV0.d
    public final void O5(TV0.e eVar, TV0.a aVar, int i12) {
        i iVar = (i) eVar;
        b bVar = (b) aVar;
        this.f261631c = bVar.f261618g;
        iVar.setTitle(bVar.f261613b);
        k(iVar, bVar);
    }

    @Override // TV0.f
    public final void g2(TV0.e eVar, TV0.a aVar, int i12, List list) {
        i iVar = (i) eVar;
        b bVar = (b) aVar;
        Object obj = null;
        for (Object obj2 : list) {
            if (obj2 instanceof Bundle) {
                obj = obj2;
            }
        }
        Bundle bundle = (Bundle) (obj instanceof Bundle ? obj : null);
        if (bundle == null) {
            this.f261631c = bVar.f261618g;
            iVar.setTitle(bVar.f261613b);
            k(iVar, bVar);
        } else {
            if (bundle.containsKey("payload_should_block_durations")) {
                this.f261631c = bundle.getBoolean("payload_should_block_durations");
            }
            k(iVar, bVar);
        }
    }

    public final void k(i iVar, b bVar) {
        String str = bVar.f261615d;
        List<b.a> list = bVar.f261614c;
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (((b.a) obj).f261624f) {
                arrayList.add(obj);
            }
        }
        iVar.ZL(new a(str, this, iVar, bVar), str, arrayList, this.f261631c);
    }
}
