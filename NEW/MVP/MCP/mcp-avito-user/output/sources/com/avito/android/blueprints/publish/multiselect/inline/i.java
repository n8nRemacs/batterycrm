package com.avito.android.blueprints.publish.multiselect.inline;

import Y41.l;
import com.avito.android.lib.design.list_item.ListItemCompoundButton;
import kotlin.jvm.internal.N;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes11.dex */
public final /* synthetic */ class i implements ListItemCompoundButton.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f106395a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ N f106396b;

    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ i(int i12, l lVar) {
        this.f106395a = i12;
        this.f106396b = (N) lVar;
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [Y41.l, kotlin.jvm.internal.N] */
    @Override // com.avito.android.lib.design.list_item.ListItemCompoundButton.a
    public final void a(ListItemCompoundButton listItemCompoundButton, boolean z12) {
        ?? r22 = this.f106396b;
        switch (this.f106395a) {
            case 0:
                r22.invoke(Boolean.valueOf(z12));
                break;
            case 1:
                int i12 = com.avito.android.search.filter.adapter.checkbox.j.f262120d;
                r22.invoke(Boolean.valueOf(z12));
                break;
            default:
                int i13 = com.avito.android.search.filter.adapter.checkboxWithBadge.j.f262135f;
                r22.invoke(Boolean.valueOf(z12));
                break;
        }
    }
}
