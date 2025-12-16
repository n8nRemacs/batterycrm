package com.avito.android.publish.items.file_uploader_redesign;

import Y41.p;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;
import kotlinx.coroutines.C43259k;

/* compiled from: FileUploaderRedesignItemPresenter.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"", "fileId", "", "isUploaded", "Lkotlin/G0;", "invoke", "(Ljava/lang/String;Z)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes16.dex */
final class j extends N implements p<String, Boolean, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ f f236848l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(f fVar) {
        super(2);
        this.f236848l = fVar;
    }

    @Override // Y41.p
    public final G0 invoke(String str, Boolean bool) {
        boolean zBooleanValue = bool.booleanValue();
        f fVar = this.f236848l;
        C43259k.d(fVar.f236838d, null, null, new i(fVar, str, zBooleanValue, null), 3);
        return G0.f406611a;
    }
}
