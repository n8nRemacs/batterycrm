package com.avito.android.messenger.conversation.mvi.file_upload;

import com.avito.android.messenger.conversation.mvi.file_upload.AbstractC32094s0;
import com.avito.android.util.V2;
import l41.InterfaceC43543a;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes15.dex */
public final /* synthetic */ class A implements InterfaceC43543a {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f190985b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ AbstractC32094s0.a f190986c;

    public /* synthetic */ A(AbstractC32094s0.a aVar, int i12) {
        this.f190985b = i12;
        this.f190986c = aVar;
    }

    @Override // l41.InterfaceC43543a
    public final void run() {
        switch (this.f190985b) {
            case 0:
                V2.f318762a.c("FileUploadInteractorImpl", "Uploading file has started, uploadId = " + this.f190986c, null);
                break;
            default:
                V2.f318762a.c("FileUploadInteractorImpl", "Uploading file has started, uploadId = " + this.f190986c, null);
                break;
        }
    }
}
