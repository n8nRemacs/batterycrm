package com.avito.android.shortcut_navigation_bar.adapter.tag;

import com.avito.android.shortcut_navigation_bar.adapter.SectionTagPayload;
import com.avito.android.shortcut_navigation_bar.adapter.TagShortcutItem;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.Q;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;

/* compiled from: TagShortcutItemPresenter.kt */
@s0
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes3.dex */
final class f extends N implements Y41.a<G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ TagShortcutItem f283356l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ g f283357m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f283358n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(TagShortcutItem tagShortcutItem, g gVar, int i12) {
        super(0);
        this.f283356l = tagShortcutItem;
        this.f283357m = gVar;
        this.f283358n = i12;
    }

    @Override // Y41.a
    public final G0 invoke() {
        String str;
        TagShortcutItem tagShortcutItem = this.f283356l;
        SectionTagPayload sectionTagPayload = tagShortcutItem.f283258e;
        g gVar = this.f283357m;
        if (sectionTagPayload != null) {
            boolean z12 = sectionTagPayload.f283242e;
            if (z12) {
                sectionTagPayload = (!z12 || (str = sectionTagPayload.f283241d) == null) ? null : new SectionTagPayload(str, "", str, z12);
            }
            if (sectionTagPayload != null) {
                gVar.f283359b.f283484g0.K5(new Q(tagShortcutItem.f283256c, sectionTagPayload));
            }
        } else {
            gVar.f283359b.h(this.f283358n);
        }
        return G0.f406611a;
    }
}
