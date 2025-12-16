package com.avito.android.advert.icebreakerseditor;

import android.content.Intent;
import android.os.Parcelable;
import b4.C25408d;
import com.avito.android.remote.model.IceBreaker;
import java.util.ArrayList;
import java.util.List;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.H;

/* compiled from: IcebreakersEditorActivity.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.avito.android.advert.icebreakerseditor.c, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
final /* synthetic */ class C27800c extends H implements Y41.a<G0> {
    @Override // Y41.a
    public final G0 invoke() {
        IcebreakersEditorActivity icebreakersEditorActivity = (IcebreakersEditorActivity) this.receiver;
        int i12 = IcebreakersEditorActivity.f71187o;
        icebreakersEditorActivity.getClass();
        List<C25408d.c> list = ((D) icebreakersEditorActivity.f71189n.getValue()).getState().getValue().f56891a;
        ArrayList arrayList = new ArrayList(C42745f0.q(list, 10));
        for (C25408d.c cVar : list) {
            int i13 = (int) cVar.f56901a;
            String str = cVar.f56902b;
            arrayList.add(new IceBreaker(i13, str, str, null));
        }
        ArrayList<? extends Parcelable> arrayList2 = new ArrayList<>(arrayList);
        Intent intent = new Intent();
        intent.putParcelableArrayListExtra("extra_result_icebreakers", arrayList2);
        icebreakersEditorActivity.setResult(-1, intent);
        icebreakersEditorActivity.finish();
        return G0.f406611a;
    }
}
