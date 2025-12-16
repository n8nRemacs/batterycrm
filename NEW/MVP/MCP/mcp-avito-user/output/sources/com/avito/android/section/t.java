package com.avito.android.section;

import androidx.recyclerview.widget.LinearLayoutManager;
import kotlin.Metadata;

/* compiled from: SectionItemView.kt */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlin/G0;", "it", "accept", "(Lkotlin/G0;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes3.dex */
final class t<T> implements l41.g {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ v f264875b;

    public t(v vVar) {
        this.f264875b = vVar;
    }

    @Override // l41.g
    public final void accept(Object obj) {
        v vVar = this.f264875b;
        Object tag = vVar.f264922h.getTag();
        if (tag instanceof String) {
            LinearLayoutManager linearLayoutManager = vVar.f264923i;
            int iH1 = linearLayoutManager.H1();
            int iM1 = linearLayoutManager.M1();
            vVar.f264916b.M1(iH1, iM1, (String) tag);
        }
    }
}
