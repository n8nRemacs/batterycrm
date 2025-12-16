package com.avito.android.messenger.conversation.mvi.file_download;

import com.avito.android.persistence.messenger.FileChunkMetaInfo;
import java.util.List;
import kotlin.Metadata;
import okhttp3.Call;
import ru.avito.messenger.MessengerUserHashInfo;

/* compiled from: FileDownloadWorkerDelegate.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u0010\u0012\f\b\u0001\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lokhttp3/Call;", "call", "Lio/reactivex/rxjava3/core/O;", "Larrow/core/Y0;", "Landroid/net/Uri;", "apply", "(Lokhttp3/Call;)Lio/reactivex/rxjava3/core/O;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes15.dex */
final class H<T, R> implements l41.o {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ x f190827b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ MessengerUserHashInfo f190828c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ String f190829d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ String f190830e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ List<FileChunkMetaInfo> f190831f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ Integer f190832g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ String f190833h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ boolean f190834i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ String f190835j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ String f190836k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ boolean f190837l;

    public H(x xVar, MessengerUserHashInfo messengerUserHashInfo, String str, String str2, List<FileChunkMetaInfo> list, Integer num, String str3, boolean z12, String str4, String str5, boolean z13) {
        this.f190827b = xVar;
        this.f190828c = messengerUserHashInfo;
        this.f190829d = str;
        this.f190830e = str2;
        this.f190831f = list;
        this.f190832g = num;
        this.f190833h = str3;
        this.f190834i = z12;
        this.f190835j = str4;
        this.f190836k = str5;
        this.f190837l = z13;
    }

    @Override // l41.o
    public final Object apply(Object obj) {
        Call call = (Call) obj;
        return this.f190827b.f190964e.p().n(new G(this.f190827b, this.f190828c, this.f190829d, this.f190830e, this.f190831f, this.f190832g, call, this.f190833h, this.f190834i, this.f190835j, this.f190836k, this.f190837l));
    }
}
