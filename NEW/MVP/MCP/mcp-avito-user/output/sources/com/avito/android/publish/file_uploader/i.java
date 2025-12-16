package com.avito.android.publish.file_uploader;

import com.avito.android.remote.model.file_uploader.FileUploadResult;
import com.avito.android.remote.model.messenger.voice.VoiceInfo;
import com.avito.android.util.P2;
import fe0.InterfaceC40409b;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;

/* compiled from: FileUploaderInteractor.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lcom/avito/android/util/P2;", "Lcom/avito/android/remote/model/file_uploader/FileUploadResult;", VoiceInfo.STATE, "Lkotlin/G0;", "accept", "(Lcom/avito/android/util/P2;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes16.dex */
final class i<T> implements l41.g {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f235688b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f235689c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ io.reactivex.rxjava3.subjects.e<InterfaceC40409b> f235690d;

    public i(io.reactivex.rxjava3.subjects.e eVar, String str, String str2) {
        this.f235688b = str;
        this.f235689c = str2;
        this.f235690d = eVar;
    }

    @Override // l41.g
    public final void accept(Object obj) {
        InterfaceC40409b c11163b;
        P2 p22 = (P2) obj;
        boolean z12 = p22 instanceof P2.b;
        io.reactivex.rxjava3.subjects.e<InterfaceC40409b> eVar = this.f235690d;
        String str = this.f235689c;
        String str2 = this.f235688b;
        if (!z12) {
            if (p22 instanceof P2.a) {
                eVar.onNext(new InterfaceC40409b.C11163b(str2, str));
                return;
            }
            return;
        }
        FileUploadResult fileUploadResult = (FileUploadResult) ((P2.b) p22).f318720a;
        if (fileUploadResult instanceof FileUploadResult.Success) {
            c11163b = new InterfaceC40409b.e(str2, (FileUploadResult.Success) fileUploadResult);
        } else {
            if (!(fileUploadResult instanceof FileUploadResult.Error)) {
                throw new NoWhenBranchMatchedException();
            }
            c11163b = new InterfaceC40409b.C11163b(str2, str);
        }
        eVar.onNext(c11163b);
    }
}
