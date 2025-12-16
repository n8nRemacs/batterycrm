package com.avito.android.inline_filters.dialog.select;

import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deeplink_handler.handler.b;
import com.avito.android.inline_filters.dialog.select.adapter.InlineItemType;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: MultiselectFilterDialog.kt */
@s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lcom/avito/android/inline_filters/dialog/select/adapter/i;", "kotlin.jvm.PlatformType", "item", "Lkotlin/G0;", "accept", "(Lcom/avito/android/inline_filters/dialog/select/adapter/i;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* renamed from: com.avito.android.inline_filters.dialog.select.f, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
final class C31036f<T> implements l41.g {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C31039i f172150b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ C31043m f172151c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.avito.android.deeplink_handler.handler.composite.a f172152d;

    public C31036f(C31039i c31039i, C31043m c31043m, com.avito.android.deeplink_handler.handler.composite.a aVar) {
        this.f172150b = c31039i;
        this.f172151c = c31043m;
        this.f172152d = aVar;
    }

    @Override // l41.g
    public final void accept(Object obj) {
        com.avito.android.inline_filters.dialog.select.adapter.i iVar = (com.avito.android.inline_filters.dialog.select.adapter.i) obj;
        boolean z12 = iVar.f172095f == InlineItemType.f172066m;
        C31039i c31039i = this.f172150b;
        if (!z12) {
            boolean z13 = iVar.f172094e;
            String str = iVar.f172092c;
            if (z13) {
                c31039i.f172165i.add(str);
            } else {
                c31039i.f172165i.remove(str);
            }
            c31039i.g(this.f172151c);
            return;
        }
        DeepLink deepLink = iVar.f172102m;
        if (deepLink != null) {
            c31039i.getClass();
            com.avito.android.deeplink_handler.handler.composite.a aVar = this.f172152d;
            if (aVar != null) {
                b.a.a(aVar, deepLink, null, null, 6);
            }
        }
    }
}
