package com.avito.android.publish.slots.job_warning_toast;

import androidx.compose.runtime.internal.P;
import com.avito.android.category_parameters.k;
import com.avito.android.component.toast.c;
import com.avito.android.component.toast.f;
import com.avito.android.remote.model.category_parameters.slot.Slot;
import com.avito.android.remote.model.category_parameters.slot.job_warning_toast.JobToastSlot;
import com.avito.android.remote.model.category_parameters.slot.job_warning_toast.JobToastSlotConfig;
import i31.InterfaceC41220a;
import java.util.Collections;
import java.util.List;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.collections.C42784z0;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.N;

/* compiled from: JobToastSlotWrapper.kt */
@P
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/avito/android/publish/slots/job_warning_toast/a;", "Lcom/avito/android/category_parameters/k;", "Lcom/avito/android/remote/model/category_parameters/slot/job_warning_toast/JobToastSlot;", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class a extends k<JobToastSlot> {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final JobToastSlot f244461b;

    /* compiled from: JobToastSlotWrapper.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.avito.android.publish.slots.job_warning_toast.a$a, reason: collision with other inner class name */
    public static final class C7323a extends N implements Y41.a<G0> {

        /* renamed from: l, reason: collision with root package name */
        public static final C7323a f244462l = new C7323a();

        public C7323a() {
            super(0);
        }

        @Override // Y41.a
        public final /* bridge */ /* synthetic */ G0 invoke() {
            return G0.f406611a;
        }
    }

    @i31.c
    public a(@InterfaceC41220a @Y61.k JobToastSlot jobToastSlot) {
        this.f244461b = jobToastSlot;
    }

    @Override // com.avito.android.category_parameters.j
    public final Slot g() {
        return this.f244461b;
    }

    @Override // com.avito.android.category_parameters.k
    @Y61.k
    public final List<com.avito.conveyor_item.a> j() {
        f fVarB;
        List listSingletonList;
        JobToastSlot jobToastSlot = this.f244461b;
        JobToastSlotConfig jobToastSlotConfig = (JobToastSlotConfig) jobToastSlot.getWidget().getConfig();
        String text = jobToastSlotConfig.getText();
        if (text == null) {
            return C42784z0.f406748b;
        }
        String id2 = jobToastSlot.getId();
        String type = jobToastSlotConfig.getType();
        if (L.f(type, "default_inverse")) {
            fVarB = f.b.f125254a;
        } else if (L.f(type, "error")) {
            f.c.f125255c.getClass();
            fVarB = f.c.a.b();
        } else {
            fVarB = f.a.f125253a;
        }
        f fVar = fVarB;
        Integer duration = jobToastSlotConfig.getDuration();
        int iIntValue = duration != null ? duration.intValue() : 2750;
        if (L.f(jobToastSlotConfig.getWithCloseButton(), Boolean.TRUE)) {
            listSingletonList = Collections.singletonList(new c.a.C3719a("Закрыть", true, null, C7323a.f244462l, 4, null));
        } else {
            listSingletonList = null;
        }
        return Collections.singletonList(new com.avito.android.publish.slots.job_warning_toast.item.a(id2, text, fVar, iIntValue, listSingletonList));
    }
}
