package com.avito.android.shift_list.ui;

import Y41.l;
import com.avito.android.shift_list.ui.list.load_more_item.ShiftListLoadMoreItem;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: ShiftListRenderer.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/conveyor_item/a;", "it", "", "invoke", "(Lcom/avito/conveyor_item/a;)Ljava/lang/Boolean;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes3.dex */
final class g extends N implements l<com.avito.conveyor_item.a, Boolean> {

    /* renamed from: l, reason: collision with root package name */
    public static final g f281108l = new g();

    public g() {
        super(1);
    }

    @Override // Y41.l
    public final Boolean invoke(com.avito.conveyor_item.a aVar) {
        return Boolean.valueOf(aVar instanceof ShiftListLoadMoreItem);
    }
}
