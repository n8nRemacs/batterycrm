package com.avito.android.publish.objects;

import com.avito.android.blueprints.publish.date_interval.c;
import com.avito.android.blueprints.publish.date_interval.f;
import com.avito.android.category_parameters.ParameterElement;
import com.avito.android.details.b;
import kotlin.Metadata;

/* compiled from: ObjectFillFormViewModel.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/publish/objects/J0;", "Lcom/avito/android/blueprints/publish/date_interval/f$a;", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class J0 implements f.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C33975x f237488a;

    /* compiled from: ObjectFillFormViewModel.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "newValue", "Lkotlin/G0;", "invoke", "(J)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a extends kotlin.jvm.internal.N implements Y41.l<Long, kotlin.G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ C33975x f237489l;

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ c.a f237490m;

        /* renamed from: n, reason: collision with root package name */
        public final /* synthetic */ ParameterElement.C29377e f237491n;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(C33975x c33975x, c.a aVar, ParameterElement.C29377e c29377e) {
            super(1);
            this.f237489l = c33975x;
            this.f237490m = aVar;
            this.f237491n = c29377e;
        }

        @Override // Y41.l
        public final kotlin.G0 invoke(Long l12) {
            long jLongValue = l12.longValue();
            ParameterElement.C29376d c29376d = this.f237490m.f106126a;
            Long lValueOf = Long.valueOf(jLongValue);
            ParameterElement.C29377e c29377e = this.f237491n;
            boolean z12 = c29377e.f117413j;
            C33975x c33975x = this.f237489l;
            c33975x.be(c29376d, c29377e, lValueOf, z12, false);
            b.InterfaceC4110b.a.a(c33975x, null, 3);
            return kotlin.G0.f406611a;
        }
    }

    /* compiled from: ObjectFillFormViewModel.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "newValue", "Lkotlin/G0;", "invoke", "(J)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class b extends kotlin.jvm.internal.N implements Y41.l<Long, kotlin.G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ C33975x f237492l;

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ c.a f237493m;

        /* renamed from: n, reason: collision with root package name */
        public final /* synthetic */ ParameterElement.C29377e f237494n;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(C33975x c33975x, c.a aVar, ParameterElement.C29377e c29377e) {
            super(1);
            this.f237492l = c33975x;
            this.f237493m = aVar;
            this.f237494n = c29377e;
        }

        @Override // Y41.l
        public final kotlin.G0 invoke(Long l12) {
            long jLongValue = l12.longValue();
            ParameterElement.C29376d c29376d = this.f237493m.f106126a;
            Long lValueOf = Long.valueOf(jLongValue);
            ParameterElement.C29377e c29377e = this.f237494n;
            boolean z12 = c29377e.f117413j;
            C33975x c33975x = this.f237492l;
            c33975x.be(c29376d, c29377e, lValueOf, z12, false);
            b.InterfaceC4110b.a.a(c33975x, null, 3);
            return kotlin.G0.f406611a;
        }
    }

    public J0(C33975x c33975x) {
        this.f237488a = c33975x;
    }

    @Override // com.avito.android.blueprints.publish.date_interval.f.a
    public final void a(@Y61.k c.a aVar, @Y61.k ParameterElement.C29377e c29377e) {
        C33975x c33975x = this.f237488a;
        ObjectFillFormFragment objectFillFormFragment = c33975x.f238130e0;
        if (objectFillFormFragment != null) {
            objectFillFormFragment.F3(aVar, c29377e, new a(c33975x, aVar, c29377e));
        }
    }

    @Override // com.avito.android.blueprints.publish.date_interval.f.a
    public final void b(@Y61.k c.a aVar) {
        ParameterElement.C29376d c29376d = aVar.f106126a;
        ParameterElement.C29377e c29377e = c29376d.f117402f;
        C33975x c33975x = this.f237488a;
        if (c29377e != null) {
            c33975x.be(c29376d, c29377e, null, aVar.f106128c, false);
        }
        b.InterfaceC4110b.a.a(c33975x, null, 3);
    }

    @Override // com.avito.android.blueprints.publish.date_interval.f.a
    public final void c(@Y61.k c.a aVar, @Y61.k ParameterElement.C29377e c29377e) {
        C33975x c33975x = this.f237488a;
        ObjectFillFormFragment objectFillFormFragment = c33975x.f238130e0;
        if (objectFillFormFragment != null) {
            b bVar = new b(c33975x, aVar, c29377e);
            com.avito.android.publish.date_picker.b bVar2 = objectFillFormFragment.f237529A0;
            if (bVar2 == null) {
                bVar2 = null;
            }
            bVar2.e(objectFillFormFragment.requireContext(), aVar, c29377e, bVar);
        }
    }
}
