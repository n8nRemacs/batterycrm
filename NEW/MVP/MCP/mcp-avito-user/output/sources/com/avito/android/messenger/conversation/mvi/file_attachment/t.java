package com.avito.android.messenger.conversation.mvi.file_attachment;

import android.content.Context;
import android.media.MediaMetadataRetriever;
import android.net.Uri;
import android.os.Environment;
import android.webkit.MimeTypeMap;
import androidx.compose.runtime.internal.P;
import androidx.core.content.FileProvider;
import androidx.work.impl.CallableC23587q;
import com.avito.android.C30277e1;
import com.avito.android.messenger.channels.mvi.data.CallableC31710s;
import com.avito.android.util.J;
import io.reactivex.rxjava3.internal.operators.completable.I;
import io.reactivex.rxjava3.internal.operators.maybe.C41916j;
import io.reactivex.rxjava3.internal.operators.single.G;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.security.MessageDigest;
import java.util.Locale;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;
import javax.inject.Inject;
import kotlin.C42727D;
import kotlin.G0;
import kotlin.InterfaceC42726C;
import kotlin.Metadata;
import kotlin.Q;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;
import kotlin.text.C43066x;

/* compiled from: FileStorageHelper.kt */
@P
@s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/messenger/conversation/mvi/file_attachment/t;", "Lcom/avito/android/messenger/conversation/mvi/file_attachment/n;", "a", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class t implements n {

    /* renamed from: j, reason: collision with root package name */
    public static final /* synthetic */ int f190736j = 0;

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final Context f190737a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final C30277e1 f190738b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final InterfaceC42726C f190739c = C42727D.c(new e());

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final InterfaceC42726C f190740d = C42727D.c(new d());

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final InterfaceC42726C f190741e = C42727D.c(new c());

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final InterfaceC42726C f190742f = C42727D.c(new f());

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public final InterfaceC42726C f190743g = C42727D.c(b.f190746l);

    /* renamed from: h, reason: collision with root package name */
    @Y61.k
    public final InterfaceC42726C f190744h = C42727D.c(g.f190751l);

    /* renamed from: i, reason: collision with root package name */
    @Y61.k
    public final InterfaceC42726C f190745i = C42727D.c(h.f190752l);

    /* compiled from: FileStorageHelper.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\u0006R\u0014\u0010\t\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\t\u0010\u0006R\u0014\u0010\n\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\n\u0010\u0006¨\u0006\u000b"}, d2 = {"Lcom/avito/android/messenger/conversation/mvi/file_attachment/t$a;", "", "<init>", "()V", "", "INTERNAL_DOWNLOAD_CACHE_FOLDER_NAME", "Ljava/lang/String;", "INTERNAL_PERSISTED_UPLOAD_CACHE_FOLDER_NAME", "INTERNAL_UPLOAD_CACHE_FOLDER_NAME", "INTERNAL_VOICE_FILE_CACHE_FOLDER_NAME", "TEMP_FILE_PREFIX", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    /* compiled from: FileStorageHelper.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u0001H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "Ljava/io/File;", "kotlin.jvm.PlatformType", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class b extends N implements Y41.a<File> {

        /* renamed from: l, reason: collision with root package name */
        public static final b f190746l = new b();

        public b() {
            super(0);
        }

        @Override // Y41.a
        public final File invoke() {
            return Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_DOWNLOADS);
        }
    }

    /* compiled from: FileStorageHelper.kt */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Ljava/io/File;", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class c extends N implements Y41.a<File> {
        public c() {
            super(0);
        }

        @Override // Y41.a
        public final File invoke() {
            return new File(t.this.f190737a.getFilesDir(), "messenger_file_download_cache");
        }
    }

    /* compiled from: FileStorageHelper.kt */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Ljava/io/File;", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class d extends N implements Y41.a<File> {
        public d() {
            super(0);
        }

        @Override // Y41.a
        public final File invoke() {
            return new File(t.this.f190737a.getFilesDir(), "messenger_persisted_file_upload_cache");
        }
    }

    /* compiled from: FileStorageHelper.kt */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Ljava/io/File;", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class e extends N implements Y41.a<File> {
        public e() {
            super(0);
        }

        @Override // Y41.a
        public final File invoke() {
            return new File(t.this.f190737a.getFilesDir(), "messenger_file_upload_cache");
        }
    }

    /* compiled from: FileStorageHelper.kt */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Ljava/io/File;", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class f extends N implements Y41.a<File> {
        public f() {
            super(0);
        }

        @Override // Y41.a
        public final File invoke() {
            return new File(t.this.f190737a.getFilesDir(), "messenger_voice_file_cache");
        }
    }

    /* compiled from: FileStorageHelper.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"<anonymous>", "", "", "invoke", "()[Ljava/lang/String;"}, k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class g extends N implements Y41.a<String[]> {

        /* renamed from: l, reason: collision with root package name */
        public static final g f190751l = new g();

        public g() {
            super(0);
        }

        @Override // Y41.a
        public final String[] invoke() {
            return new String[]{"_display_name", "_size"};
        }
    }

    /* compiled from: FileStorageHelper.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"<anonymous>", "", "", "invoke", "()[Ljava/lang/String;"}, k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class h extends N implements Y41.a<String[]> {

        /* renamed from: l, reason: collision with root package name */
        public static final h f190752l = new h();

        public h() {
            super(0);
        }

        @Override // Y41.a
        public final String[] invoke() {
            return new String[]{"_display_name", "_size"};
        }
    }

    static {
        new a(null);
    }

    @Inject
    public t(@Y61.k Context context, @Y61.k C30277e1 c30277e1) {
        this.f190737a = context;
        this.f190738b = c30277e1;
    }

    public static File y(File file, String str) {
        File file2 = new File(file, str);
        String name = file2.getName();
        int iN2 = C43066x.N(6, name, ".");
        int i12 = 0;
        if (iN2 != -1) {
            name = name.substring(0, iN2);
        }
        String strN0 = C43066x.n0('.', file2.getName(), "");
        while (file2.exists()) {
            StringBuilder sbZ = androidx.appcompat.app.r.z(name, " (");
            i12++;
            sbZ.append(i12);
            sbZ.append(')');
            sbZ.append(strN0.length() > 0 ? ".".concat(strN0) : "");
            file2 = new File(file, sbZ.toString());
        }
        return file2;
    }

    public final Uri A(File file) {
        StringBuilder sb2 = new StringBuilder();
        Context context = this.f190737a;
        sb2.append(context.getPackageName());
        sb2.append(".provider");
        return FileProvider.getUriForFile(context, sb2.toString(), file);
    }

    @Override // com.avito.android.messenger.conversation.mvi.file_attachment.n
    @Y61.k
    public final G a() {
        return new G(new r(this, 0));
    }

    @Override // com.avito.android.messenger.conversation.mvi.file_attachment.n
    @Y61.k
    public final G b(@Y61.k String str) {
        return new G(new q(this, str, 5));
    }

    @Override // com.avito.android.messenger.conversation.mvi.file_attachment.n
    @Y61.k
    public final G c(@Y61.k File file, @Y61.k String str, @Y61.k String str2) {
        return new G(new CallableC31710s(this, str, str2, file));
    }

    @Override // com.avito.android.messenger.conversation.mvi.file_attachment.n
    @Y61.k
    public final C41916j d(@Y61.k Uri uri, @Y61.l String str) {
        return new C41916j(new FX0.b(this, uri, str, 12));
    }

    @Override // com.avito.android.messenger.conversation.mvi.file_attachment.n
    @Y61.k
    public final G e(@Y61.k Uri uri) {
        return new G(new o(this, uri, 1));
    }

    @Override // com.avito.android.messenger.conversation.mvi.file_attachment.n
    @Y61.k
    public final String f(@Y61.k String str, @Y61.l String str2) {
        String mimeTypeFromExtension;
        if (!L.f(str2, "application/octet-stream")) {
            return str2 == null ? "application/octet-stream" : str2;
        }
        String strN0 = C43066x.n0('.', str, "");
        if (C43066x.K(strN0)) {
            strN0 = null;
        }
        return (strN0 == null || (mimeTypeFromExtension = MimeTypeMap.getSingleton().getMimeTypeFromExtension(strN0.toLowerCase(Locale.getDefault()))) == null) ? str2 : mimeTypeFromExtension;
    }

    @Override // com.avito.android.messenger.conversation.mvi.file_attachment.n
    @Y61.k
    public final G g(@Y61.k Uri uri) {
        return new G(new o(this, uri, 0));
    }

    @Override // com.avito.android.messenger.conversation.mvi.file_attachment.n
    @Y61.k
    public final G h(@Y61.k File file) {
        return new G(new p(file, this));
    }

    @Override // com.avito.android.messenger.conversation.mvi.file_attachment.n
    @Y61.k
    public final G i(@Y61.k Uri uri, @Y61.l String str) {
        return new G(new CallableC23587q(this, uri, str, 10));
    }

    @Override // com.avito.android.messenger.conversation.mvi.file_attachment.n
    @Y61.k
    public final G j(@Y61.k String str) {
        return new G(new q(this, str, 4));
    }

    @Override // com.avito.android.messenger.conversation.mvi.file_attachment.n
    @Y61.k
    public final G k(@Y61.k String str) {
        return new G(new q(this, str, 1));
    }

    @Override // com.avito.android.messenger.conversation.mvi.file_attachment.n
    @Y61.k
    public final G l(@Y61.k File file) {
        return new G(new p(this, file));
    }

    @Override // com.avito.android.messenger.conversation.mvi.file_attachment.n
    @Y61.k
    public final InputStream m(@Y61.k Uri uri) throws FileNotFoundException {
        InputStream inputStreamOpenInputStream = this.f190737a.getContentResolver().openInputStream(uri);
        if (inputStreamOpenInputStream != null) {
            return inputStreamOpenInputStream;
        }
        throw new IllegalStateException(androidx.appcompat.app.r.n(uri, "Can't get input stream "));
    }

    @Override // com.avito.android.messenger.conversation.mvi.file_attachment.n
    @Y61.k
    public final G n(@Y61.k String str) {
        return new G(new q(this, str, 0));
    }

    @Override // com.avito.android.messenger.conversation.mvi.file_attachment.n
    @Y61.k
    public final G o(@Y61.k String str) {
        return new G(new q(this, str, 3));
    }

    @Override // com.avito.android.messenger.conversation.mvi.file_attachment.n
    @Y61.k
    public final G p() {
        return new G(new r(this, 4));
    }

    @Override // com.avito.android.messenger.conversation.mvi.file_attachment.n
    @Y61.l
    public final String q(@Y61.k String str) {
        return MimeTypeMap.getSingleton().getExtensionFromMimeType(str);
    }

    @Override // com.avito.android.messenger.conversation.mvi.file_attachment.n
    @Y61.k
    public final G r() {
        return new G(new r(this, 3));
    }

    @Override // com.avito.android.messenger.conversation.mvi.file_attachment.n
    @Y61.k
    public final G s(@Y61.k final File file, final long j12) {
        return new G(new Callable() { // from class: com.avito.android.messenger.conversation.mvi.file_attachment.s
            @Override // java.util.concurrent.Callable
            public final Object call() {
                long j13 = j12;
                t tVar = this;
                int i12 = t.f190736j;
                FileInputStream fileInputStream = new FileInputStream(file);
                try {
                    fileInputStream.skip(j13);
                    int i13 = (int) 5242880;
                    byte[] bArr = new byte[i13];
                    int i14 = fileInputStream.read(bArr, 0, i13);
                    if (i14 <= 0) {
                        bArr = new byte[0];
                    } else if (i14 < i13) {
                        byte[] bArr2 = new byte[i14];
                        for (int i15 = 0; i15 < i14; i15++) {
                            bArr2[i15] = bArr[i15];
                        }
                        bArr = bArr2;
                    }
                    tVar.getClass();
                    String strA = J.a(MessageDigest.getInstance("SHA-256").digest(bArr));
                    File fileCreateTempFile = File.createTempFile("file-", null, (File) tVar.f190740d.getValue());
                    FileOutputStream fileOutputStream = new FileOutputStream(fileCreateTempFile);
                    try {
                        fileOutputStream.write(bArr);
                        G0 g02 = G0.f406611a;
                        kotlin.io.c.a(fileOutputStream, null);
                        Q q12 = new Q(fileCreateTempFile, strA);
                        kotlin.io.c.a(fileInputStream, null);
                        return q12;
                    } finally {
                    }
                } finally {
                }
            }
        });
    }

    @Override // com.avito.android.messenger.conversation.mvi.file_attachment.n
    @Y61.k
    public final G t(@Y61.k String str) {
        return new G(new q(this, str, 2));
    }

    @Override // com.avito.android.messenger.conversation.mvi.file_attachment.n
    @Y61.k
    public final G u() {
        return new G(new r(this, 2));
    }

    @Override // com.avito.android.messenger.conversation.mvi.file_attachment.n
    @Y61.k
    public final I v(@Y61.k Uri uri) {
        return new io.reactivex.rxjava3.internal.operators.completable.r(new o(this, uri, 2)).l(u.f190753b).r();
    }

    @Override // com.avito.android.messenger.conversation.mvi.file_attachment.n
    @Y61.k
    public final G w(@Y61.k File file, @Y61.k String str) {
        return new G(new CallableC23587q(11, this, file, str));
    }

    @Override // com.avito.android.messenger.conversation.mvi.file_attachment.n
    @Y61.k
    public final I x() {
        return new io.reactivex.rxjava3.internal.operators.completable.r(new r(this, 1)).l(v.f190754b).r();
    }

    public final Long z(Uri uri, String str) throws SecurityException, IllegalArgumentException {
        Long lZ02;
        Context context = this.f190737a;
        MediaMetadataRetriever mediaMetadataRetriever = new MediaMetadataRetriever();
        try {
            mediaMetadataRetriever.setDataSource(context, uri);
        } catch (Throwable th2) {
            if (str == null) {
                throw th2;
            }
            mediaMetadataRetriever.setDataSource(context, Uri.fromFile(new File(str)));
        }
        String strExtractMetadata = mediaMetadataRetriever.extractMetadata(9);
        if (strExtractMetadata == null || (lZ02 = C43066x.z0(strExtractMetadata)) == null) {
            return null;
        }
        return Long.valueOf(TimeUnit.MILLISECONDS.toSeconds(lZ02.longValue()));
    }
}
