package com.avito.android.job.cv_info_actualization.ui.items.chips;

import Y61.k;
import android.view.View;
import com.avito.android.R;
import com.avito.android.lib.design.chips.Chips;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;

/* compiled from: JsxCvInfoActualizationChipsView.kt */
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/job/cv_info_actualization/ui/items/chips/h;", "Lcom/avito/konveyor/adapter/b;", "_avito_job_cv-info-actualization_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class h extends com.avito.konveyor.adapter.b {

    /* renamed from: b, reason: collision with root package name */
    public final Chips f174255b;

    public h(@k View view) {
        super(view);
        this.f174255b = (Chips) view.findViewById(R.id.chips);
    }

    public static final a B80(h hVar, com.avito.android.lib.design.chips.h hVar2, List list) {
        Object obj;
        hVar.getClass();
        Iterator it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            a aVar = (a) next;
            String str = aVar.f174237c;
            a aVar2 = hVar2 instanceof a ? (a) hVar2 : null;
            if (L.f(str, aVar2 != null ? aVar2.f174237c : null) && L.f(aVar.f174236b, ((a) hVar2).f174236b)) {
                obj = next;
                break;
            }
        }
        return (a) obj;
    }
}
