package com.avito.android.beduin.common.component.file_uploader;

import com.avito.android.beduin.common.component.file_uploader.n;
import com.avito.android.beduin.common.component.file_uploader.x;
import kotlin.Metadata;

/* compiled from: BeduinFileUploaderViewModel.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "Lkotlin/G0;", "accept", "(Ljava/lang/Throwable;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes11.dex */
final class s<T> implements l41.g {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ n f101321b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ n.a f101322c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.avito.android.beduin.common.component.file_uploader.validation.a f101323d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ String f101324e;

    public s(n nVar, n.a aVar, com.avito.android.beduin.common.component.file_uploader.validation.a aVar2, String str) {
        this.f101321b = nVar;
        this.f101322c = aVar;
        this.f101323d = aVar2;
        this.f101324e = str;
    }

    @Override // l41.g
    public final void accept(Object obj) {
        n.a(this.f101321b, this.f101322c, new x.b(this.f101323d.f101333b, this.f101324e));
    }
}
