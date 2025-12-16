package com.avito.android.publish.file_uploader;

import android.content.ContentResolver;
import android.database.Cursor;
import android.net.Uri;
import androidx.compose.runtime.internal.P;
import com.avito.android.messenger.blacklist.mvi.C31684n;
import com.avito.android.remote.H0;
import com.avito.android.util.InterfaceC35745a5;
import fe0.C40408a;
import io.reactivex.rxjava3.internal.operators.observable.B0;
import io.reactivex.rxjava3.internal.operators.observable.C41982q1;
import io.reactivex.rxjava3.internal.operators.observable.I0;
import io.reactivex.rxjava3.internal.operators.observable.K0;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.Q;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.s0;
import okhttp3.MultipartBody;
import zZ.C50528b;

/* compiled from: FileUploaderInteractor.kt */
@P
@s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/publish/file_uploader/c;", "Lcom/avito/android/publish/file_uploader/a;", "a", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.avito.android.publish.file_uploader.c, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C33855c implements InterfaceC33853a {

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ int f235676d = 0;

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final H0 f235677a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final ContentResolver f235678b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final InterfaceC35745a5 f235679c;

    /* compiled from: FileUploaderInteractor.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/avito/android/publish/file_uploader/c$a;", "", "<init>", "()V", "", "THROTTLE_DURATION_SM", "J", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.publish.file_uploader.c$a */
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    static {
        new a(null);
    }

    @Inject
    public C33855c(@Y61.k H0 h02, @Y61.k ContentResolver contentResolver, @Y61.k InterfaceC35745a5 interfaceC35745a5) {
        this.f235677a = h02;
        this.f235678b = contentResolver;
        this.f235679c = interfaceC35745a5;
    }

    @Override // com.avito.android.publish.file_uploader.InterfaceC33853a
    @Y61.k
    public final io.reactivex.rxjava3.internal.operators.single.G a(@Y61.k final Uri uri) {
        return new io.reactivex.rxjava3.internal.operators.single.G(new Callable() { // from class: com.avito.android.publish.file_uploader.b
            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.util.concurrent.Callable
            public final Object call() {
                Q q12;
                int i12 = C33855c.f235676d;
                StringBuilder sb2 = new StringBuilder();
                Uri uri2 = uri;
                sb2.append(uri2.getLastPathSegment());
                sb2.append(System.currentTimeMillis());
                String string = sb2.toString();
                C33855c c33855c = this.f235674b;
                String type = c33855c.f235678b.getType(uri2);
                String str = "";
                String str2 = type == null ? "" : type;
                Cursor cursorQuery = c33855c.f235678b.query(uri2, null, null, null, null, null);
                if (cursorQuery != null) {
                    Cursor cursor = cursorQuery;
                    try {
                        Cursor cursor2 = cursor;
                        int columnIndex = cursor2.getColumnIndex("_size");
                        Long lValueOf = (!cursor2.moveToFirst() || columnIndex < 0) ? null : Long.valueOf(cursor2.getLong(columnIndex));
                        Long lValueOf2 = Long.valueOf(lValueOf != null ? lValueOf.longValue() : 0L);
                        int columnIndex2 = cursor2.getColumnIndex("_display_name");
                        String string2 = (!cursor2.moveToFirst() || columnIndex2 < 0) ? null : cursor2.getString(columnIndex2);
                        if (string2 != null) {
                            str = string2;
                        }
                        q12 = new Q(lValueOf2, str);
                        kotlin.io.c.a(cursor, null);
                    } finally {
                    }
                } else {
                    q12 = new Q(0L, "");
                }
                return new C40408a(uri2, string, ((Number) q12.f406619b).longValue(), (String) q12.f406620c, str2);
            }
        });
    }

    @Override // com.avito.android.publish.file_uploader.InterfaceC33853a
    @Y61.k
    public final C41982q1 b(@Y61.k C40408a c40408a, @Y61.k String str, @Y61.k String str2) {
        io.reactivex.rxjava3.subjects.e eVar = new io.reactivex.rxjava3.subjects.e();
        String str3 = c40408a.f395990b;
        K0 k0L0 = this.f235677a.b(str2, MultipartBody.Part.INSTANCE.createFormData("file", c40408a.f395992d, new C50528b(c40408a.f395989a, this.f235678b, 0, null, new C33858f(eVar, str3, str), 12, null))).d0(C33859g.f235686b).l0(C33860h.f235687b);
        InterfaceC35745a5 interfaceC35745a5 = this.f235679c;
        return eVar.C0(50L, TimeUnit.MILLISECONDS, io.reactivex.rxjava3.schedulers.b.f404942b).J(new C31684n((io.reactivex.rxjava3.internal.observers.y) k0L0.x0(interfaceC35745a5.a()).j0(interfaceC35745a5.e()).v0(new i(eVar, str3, str), new j(eVar, str3, str), io.reactivex.rxjava3.internal.functions.a.f401993c), 11), io.reactivex.rxjava3.internal.functions.a.f401994d).x0(interfaceC35745a5.a());
    }

    @Override // com.avito.android.publish.file_uploader.InterfaceC33853a
    @Y61.k
    public final I0 c(@Y61.k String str, @Y61.k String str2, @Y61.k String str3) {
        B0 b0D0 = this.f235677a.c(str3, str).d0(new C33856d(str2)).d0(new C33857e(str, str2));
        InterfaceC35745a5 interfaceC35745a5 = this.f235679c;
        return b0D0.x0(interfaceC35745a5.a()).j0(interfaceC35745a5.e());
    }
}
