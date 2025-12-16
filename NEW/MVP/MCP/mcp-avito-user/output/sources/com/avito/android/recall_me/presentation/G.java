package com.avito.android.recall_me.presentation;

import com.avito.android.recall_me.presentation.items.single_input.SingleInputItem;
import com.avito.android.recall_me.presentation.items.single_input.SingleInputType;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;
import zi0.InterfaceC50571a;

/* compiled from: RecallMeViewModel.kt */
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lzi0/a$d;", "it", "Lkotlin/G0;", "accept", "(Lzi0/a$d;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes16.dex */
final class G<T> implements l41.g {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ I f251876b;

    public G(I i12) {
        this.f251876b = i12;
    }

    @Override // l41.g
    public final void accept(Object obj) {
        String str;
        SingleInputItem singleInputItem = ((InterfaceC50571a.d) obj).f444181a;
        if (singleInputItem.f251944c == SingleInputType.f251952c) {
            I i12 = this.f251876b;
            if (!i12.f251890U || (str = singleInputItem.f251949h) == null || str.length() == 0) {
                return;
            }
            singleInputItem.f251950i = false;
            i12.f251890U = false;
        }
    }
}
