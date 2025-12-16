package com.avito.android.messenger.conversation.mvi.file_upload;

import com.avito.android.messenger.conversation.mvi.file_upload.AbstractC32094s0;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Metadata;
import l41.InterfaceC43543a;

/* compiled from: Completables.kt */
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0004\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002¨\u0006\u0003"}, d2 = {"Lkotlin/G0;", "run", "()V", "com/avito/android/util/rx3/a", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes15.dex */
public final class G0 implements InterfaceC43543a {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.jakewharton.rxrelay3.c f191023b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ C32104x0 f191024c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ AbstractC32094s0.a f191025d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ AtomicBoolean f191026e;

    public G0(AbstractC32094s0.a aVar, C32104x0 c32104x0, com.jakewharton.rxrelay3.c cVar, AtomicBoolean atomicBoolean) {
        this.f191023b = cVar;
        this.f191024c = c32104x0;
        this.f191025d = aVar;
        this.f191026e = atomicBoolean;
    }

    @Override // l41.InterfaceC43543a
    public final void run() {
        int i12 = C32104x0.f191321p;
        AbstractC32094s0.a aVar = this.f191025d;
        com.jakewharton.rxrelay3.c cVar = this.f191023b;
        cVar.accept(this.f191024c.e(aVar, cVar, this.f191026e));
    }
}
