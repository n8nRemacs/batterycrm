package com.avito.android.beduin.common.utils;

import com.avito.android.lib.design.input.Input;
import com.avito.android.util.K2;
import java.lang.ref.WeakReference;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: InputViewContainers.kt */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"_avito_beduin_impl"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class w {

    /* compiled from: InputViewContainers.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "visible", "Lkotlin/G0;", "invoke", "(Z)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a extends N implements Y41.l<Boolean, G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ WeakReference<Input> f103549l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(WeakReference<Input> weakReference) {
            super(1);
            this.f103549l = weakReference;
        }

        @Override // Y41.l
        public final G0 invoke(Boolean bool) {
            Input input;
            if (!bool.booleanValue() && (input = this.f103549l.get()) != null) {
                input.clearFocus();
            }
            return G0.f406611a;
        }
    }

    public static final void a(@Y61.k com.avito.android.beduin.common.component.input.g gVar) {
        io.reactivex.rxjava3.disposables.c cVar = gVar.f101551e;
        cVar.e();
        Input input = gVar.f101549c;
        cVar.b(K2.b(input, new a(new WeakReference(input))));
    }
}
