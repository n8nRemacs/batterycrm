package com.avito.android.beduin_content;

import Y41.p;
import android.view.View;
import android.view.ViewGroup;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: BeduinSerpItemBlueprint.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "Lcom/avito/android/beduin_content/BeduinSerpItemViewImpl;", "<anonymous parameter 0>", "Landroid/view/ViewGroup;", "view", "Landroid/view/View;", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
final class b extends N implements p<ViewGroup, View, BeduinSerpItemViewImpl> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ a f105227l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(a aVar) {
        super(2);
        this.f105227l = aVar;
    }

    @Override // Y41.p
    public final BeduinSerpItemViewImpl invoke(ViewGroup viewGroup, View view) {
        return new BeduinSerpItemViewImpl(view, this.f105227l.f105225b.a(0));
    }
}
