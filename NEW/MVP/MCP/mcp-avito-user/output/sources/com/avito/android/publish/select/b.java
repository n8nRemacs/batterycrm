package com.avito.android.publish.select;

import androidx.recyclerview.widget.RecyclerView;
import com.avito.android.lib.design.button.Button;
import com.avito.android.publish.select.SelectViewModel;
import com.avito.android.remote.model.messenger.voice.VoiceInfo;
import com.avito.android.util.D6;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: SelectFragment.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lcom/avito/android/publish/select/g;", "kotlin.jvm.PlatformType", VoiceInfo.STATE, "Lkotlin/G0;", "invoke", "(Lcom/avito/android/publish/select/g;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes16.dex */
final class b extends N implements Y41.l<g, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ SelectFragment f242652l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(SelectFragment selectFragment) {
        super(1);
        this.f242652l = selectFragment;
    }

    /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Object, java.util.List] */
    @Override // Y41.l
    public final G0 invoke(g gVar) {
        g gVar2 = gVar;
        SelectFragment selectFragment = this.f242652l;
        com.avito.konveyor.adapter.a aVar = selectFragment.f242625p0;
        if (aVar == null) {
            aVar = null;
        }
        com.avito.konveyor.util.a.a(aVar, gVar2.f242695a);
        RecyclerView.Adapter<?> adapter = selectFragment.f242624o0;
        if (adapter == null) {
            adapter = null;
        }
        adapter.notifyDataSetChanged();
        Hf0.b bVar = selectFragment.f242632w0;
        Hf0.b bVar2 = bVar != null ? bVar : null;
        boolean z12 = gVar2.f242696b == SelectViewModel.MainActionState.f242645b;
        Button button = bVar2.f7601a;
        if (z12) {
            if (button != null) {
                D6.H(button);
            }
        } else if (button != null) {
            D6.w(button);
        }
        return G0.f406611a;
    }
}
