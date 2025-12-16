package com.avito.android.recall_me.presentation;

import com.avito.android.recall_me.domain.RecallMeFormState;
import com.avito.android.recall_me.presentation.items.single_input.SingleInputType;
import kotlin.Metadata;
import zi0.InterfaceC50571a;

/* compiled from: RecallMeViewModel.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lzi0/a$c;", "it", "Lkotlin/G0;", "accept", "(Lzi0/a$c;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes16.dex */
final class H<T> implements l41.g {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ I f251877b;

    /* compiled from: RecallMeViewModel.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class a {
        static {
            int[] iArr = new int[SingleInputType.values().length];
            try {
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                SingleInputType singleInputType = SingleInputType.f251951b;
                iArr[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public H(I i12) {
        this.f251877b = i12;
    }

    @Override // l41.g
    public final void accept(Object obj) {
        InterfaceC50571a.c cVar = (InterfaceC50571a.c) obj;
        int iOrdinal = cVar.f444179a.ordinal();
        I i12 = this.f251877b;
        String str = cVar.f444180b;
        if (iOrdinal == 0) {
            RecallMeFormState recallMeFormState = i12.f251888S;
            (recallMeFormState != null ? recallMeFormState : null).f251830b = str;
        } else {
            if (iOrdinal != 1) {
                return;
            }
            RecallMeFormState recallMeFormState2 = i12.f251888S;
            (recallMeFormState2 != null ? recallMeFormState2 : null).f251831c = str;
        }
    }
}
