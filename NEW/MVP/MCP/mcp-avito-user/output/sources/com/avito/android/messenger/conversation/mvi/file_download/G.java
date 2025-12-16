package com.avito.android.messenger.conversation.mvi.file_download;

import androidx.work.impl.CallableC23587q;
import com.avito.android.messenger.conversation.mvi.data.InterfaceC32024m;
import com.avito.android.persistence.messenger.FileChunkMetaInfo;
import java.io.File;
import java.util.List;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;
import okhttp3.Call;
import ru.avito.messenger.MessengerUserHashInfo;

/* compiled from: FileDownloadWorkerDelegate.kt */
@s0
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u0010\u0012\f\b\u0001\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Ljava/io/File;", "cacheFile", "Lio/reactivex/rxjava3/core/O;", "Larrow/core/Y0;", "Landroid/net/Uri;", "apply", "(Ljava/io/File;)Lio/reactivex/rxjava3/core/O;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes15.dex */
final class G<T, R> implements l41.o {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ x f190815b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ MessengerUserHashInfo f190816c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ String f190817d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ String f190818e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ List<FileChunkMetaInfo> f190819f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ Integer f190820g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ Call f190821h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ String f190822i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ boolean f190823j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ String f190824k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ String f190825l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ boolean f190826m;

    public G(x xVar, MessengerUserHashInfo messengerUserHashInfo, String str, String str2, List<FileChunkMetaInfo> list, Integer num, Call call, String str3, boolean z12, String str4, String str5, boolean z13) {
        this.f190815b = xVar;
        this.f190816c = messengerUserHashInfo;
        this.f190817d = str;
        this.f190818e = str2;
        this.f190819f = list;
        this.f190820g = num;
        this.f190821h = call;
        this.f190822i = str3;
        this.f190823j = z12;
        this.f190824k = str4;
        this.f190825l = str5;
        this.f190826m = z13;
    }

    @Override // l41.o
    public final Object apply(Object obj) {
        File file = (File) obj;
        x xVar = this.f190815b;
        InterfaceC32024m interfaceC32024m = xVar.f190961b;
        String path = file.getPath();
        String str = this.f190817d;
        String str2 = this.f190818e;
        MessengerUserHashInfo messengerUserHashInfo = this.f190816c;
        return interfaceC32024m.A(messengerUserHashInfo, str, str2, path, this.f190819f, this.f190820g).g(new io.reactivex.rxjava3.internal.operators.completable.r(new CallableC23587q(this.f190821h, file, this.f190822i, 12)).x(xVar.f190966g.a())).B(G0.f406611a).n(new F(this.f190823j, this.f190815b, file, this.f190824k, this.f190825l, this.f190826m)).n(new D(file, this.f190815b, messengerUserHashInfo, str, str2, this.f190819f, this.f190820g)).i(new E(file));
    }
}
