package com.avito.android.crm_paid_cvs.view.dialogs;

import android.view.View;
import com.avito.android.crm_paid_cvs.dto.OptionItem;
import com.avito.android.lib.design.input.Input;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.C42745f0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes12.dex */
public final /* synthetic */ class a implements View.OnClickListener {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f130781b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ b f130782c;

    public /* synthetic */ a(b bVar, int i12) {
        this.f130781b = i12;
        this.f130782c = bVar;
    }

    /* JADX WARN: Type inference failed for: r7v2, types: [Y41.l, kotlin.jvm.internal.N] */
    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        Input input;
        b bVar = this.f130782c;
        switch (this.f130781b) {
            case 0:
                SearchView searchView = bVar.f130788I;
                if (searchView != null && (input = searchView.getInput()) != null) {
                    Input.t(input, "", false, 6);
                }
                bVar.f130793N.clear();
                List<OptionItem> list = bVar.f130792M;
                ArrayList arrayList = new ArrayList(C42745f0.q(list, 10));
                Iterator<T> it = list.iterator();
                while (it.hasNext()) {
                    arrayList.add(OptionItem.a((OptionItem) it.next(), false, null, 61));
                }
                bVar.Y(arrayList);
                break;
            case 1:
                int i12 = b.f130783R;
                bVar.dismiss();
                break;
            default:
                List<OptionItem> list2 = bVar.f130792M;
                ArrayList arrayList2 = new ArrayList();
                for (Object obj : list2) {
                    if (bVar.f130793N.contains(((OptionItem) obj).f130375g)) {
                        arrayList2.add(obj);
                    }
                }
                bVar.f130784E.invoke(arrayList2);
                break;
        }
    }
}
