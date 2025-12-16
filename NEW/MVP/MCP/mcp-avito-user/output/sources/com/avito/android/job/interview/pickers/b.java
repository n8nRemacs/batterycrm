package com.avito.android.job.interview.pickers;

import Y41.l;
import Y41.p;
import android.content.Context;
import com.avito.android.R;
import com.avito.android.advert.item.consultation.C;
import com.avito.android.lib.design.button.Button;
import com.avito.android.lib.design.picker.Picker;
import com.avito.android.lib.design.picker.WheelGravity;
import com.avito.android.lib.design.picker.k;
import com.avito.android.lib.design.picker.m;
import com.avito.android.util.D6;
import java.util.ArrayList;
import java.util.Calendar;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;
import vQ.InterfaceC49249a;

/* compiled from: DatePickerDialog.kt */
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/job/interview/pickers/b;", "Lcom/avito/android/lib/design/bottom_sheet/d;", "_avito_job_interview_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class b extends com.avito.android.lib.design.bottom_sheet.d {

    /* renamed from: G, reason: collision with root package name */
    public static final /* synthetic */ int f174653G = 0;

    /* renamed from: E, reason: collision with root package name */
    @Y61.k
    public final l<InterfaceC49249a.c, G0> f174654E;

    /* renamed from: F, reason: collision with root package name */
    public final Calendar f174655F;

    /* compiled from: DatePickerDialog.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u00032\f\u0010\u0001\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u00002\f\u0010\u0002\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lcom/avito/android/lib/design/picker/k;", "firstWheelData", "secondWheelData", "Lkotlin/G0;", "invoke", "(Lcom/avito/android/lib/design/picker/k;Lcom/avito/android/lib/design/picker/k;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a extends N implements p<com.avito.android.lib.design.picker.k<?>, com.avito.android.lib.design.picker.k<?>, G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ com.avito.android.lib.design.picker.k<?> f174656l;

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ com.avito.android.lib.design.picker.k<?> f174657m;

        /* renamed from: n, reason: collision with root package name */
        public final /* synthetic */ b f174658n;

        /* renamed from: o, reason: collision with root package name */
        public final /* synthetic */ Picker f174659o;

        /* renamed from: p, reason: collision with root package name */
        public final /* synthetic */ com.avito.android.lib.design.picker.k<Integer> f174660p;

        /* renamed from: q, reason: collision with root package name */
        public final /* synthetic */ Button f174661q;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(b bVar, Button button, Picker picker, com.avito.android.lib.design.picker.k kVar, com.avito.android.lib.design.picker.k kVar2, com.avito.android.lib.design.picker.k kVar3) {
            super(2);
            this.f174656l = kVar;
            this.f174657m = kVar2;
            this.f174658n = bVar;
            this.f174659o = picker;
            this.f174660p = kVar3;
            this.f174661q = button;
        }

        @Override // Y41.p
        public final G0 invoke(com.avito.android.lib.design.picker.k<?> kVar, com.avito.android.lib.design.picker.k<?> kVar2) {
            com.avito.android.lib.design.picker.k<?> kVar3 = kVar;
            com.avito.android.lib.design.picker.k<?> kVar4 = kVar2;
            if (L.f(kVar3, this.f174656l) && L.f(kVar4, this.f174657m)) {
                Picker picker = this.f174659o;
                com.avito.android.lib.design.picker.k<Integer> kVar5 = this.f174660p;
                Button button = this.f174661q;
                b.V(this.f174658n, button, picker, kVar3, kVar4, kVar5);
                picker.f();
                picker.setOnSelection(new com.avito.android.job.interview.pickers.a(this.f174658n, picker, kVar5, button));
            }
            return G0.f406611a;
        }
    }

    /* compiled from: DatePickerDialog.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.avito.android.job.interview.pickers.b$b, reason: collision with other inner class name */
    public static final class C5152b extends N implements Y41.a<G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Button f174662l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C5152b(Button button) {
            super(0);
            this.f174662l = button;
        }

        @Override // Y41.a
        public final G0 invoke() {
            D6.h(this.f174662l);
            return G0.f406611a;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public b(@Y61.k Context context, int i12, @Y61.k l<? super InterfaceC49249a.c, G0> lVar, @Y61.k com.avito.android.job.interview.domain.a aVar) {
        super(context, 0, 2, null);
        this.f174654E = lVar;
        Calendar calendar = Calendar.getInstance();
        calendar.set(2, aVar.f174540b);
        calendar.set(5, aVar.f174541c);
        this.f174655F = calendar;
        D(R.layout.interview_invitation_date_picker, true);
        com.avito.android.lib.design.bottom_sheet.j.c(this, context.getString(R.string.interview_invitation_time_picker_title), true, 0, 0, 0, 120);
        com.avito.android.lib.design.bottom_sheet.d.I(this, true);
        Button button = (Button) findViewById(R.id.apply);
        Picker picker = (Picker) findViewById(R.id.date_picker);
        com.avito.android.lib.design.picker.k.f180042c.getClass();
        Picker.d(picker, k.a.b(), new m(WheelGravity.f179988c, false, 0, 6, null), 12);
        ArrayList<com.avito.android.lib.design.picker.k<?>> arrayList = com.avito.android.lib.design.picker.k.f180044e;
        Picker.d(picker, arrayList, new m(WheelGravity.f179987b, false, 0, 6, null), 12);
        com.avito.android.lib.design.picker.k<?> kVar = (com.avito.android.lib.design.picker.k) k.a.b().get(calendar.get(5) - 1);
        com.avito.android.lib.design.picker.k<?> kVar2 = arrayList.get(calendar.get(2));
        picker.setFirstWheelValue(kVar);
        picker.setSecondWheelValue(kVar2);
        C5152b c5152b = new C5152b(button);
        picker.setOnScrollStartedCallback(c5152b);
        picker.setOnSecondScrollStartedCallback(c5152b);
        picker.setOnSelection(new a(this, button, picker, kVar, kVar2, new com.avito.android.lib.design.picker.k(Integer.valueOf(calendar.get(1)), "")));
        button.setOnClickListener(new C(picker, this, i12, 8));
    }

    public static final void V(b bVar, Button button, Picker picker, com.avito.android.lib.design.picker.k kVar, com.avito.android.lib.design.picker.k kVar2, com.avito.android.lib.design.picker.k kVar3) {
        bVar.getClass();
        if (kVar == null || kVar2 == null) {
            return;
        }
        com.avito.android.lib.design.picker.k.f180042c.getClass();
        if (k.a.a(kVar, kVar2, kVar3)) {
            button.setText(picker.getContext().getString(R.string.interview_invitation_picker_apply));
            D6.k(button);
        } else {
            button.setText(picker.getContext().getString(R.string.interview_invitation_picker_select_valid_date));
            D6.h(button);
        }
    }
}
