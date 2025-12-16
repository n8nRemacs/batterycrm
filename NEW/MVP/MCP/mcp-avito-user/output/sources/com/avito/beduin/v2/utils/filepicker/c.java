package com.avito.beduin.v2.utils.filepicker;

import android.database.Cursor;
import android.net.Uri;
import androidx.core.content.FileProvider;
import androidx.fragment.app.Fragment;
import androidx.view.n;
import com.avito.beduin.v2.logger.LogLevel;
import com.avito.beduin.v2.utils.filepicker.b;
import i.b;
import java.io.File;
import java.io.IOException;
import java.util.List;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.H;
import kotlin.jvm.internal.s0;
import kotlin.text.C43066x;

/* compiled from: AndroidFilePicker.kt */
@s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/beduin/v2/utils/filepicker/c;", "Lcom/avito/beduin/v2/utils/filepicker/e;", "e", "file-picker_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class c implements com.avito.beduin.v2.utils.filepicker.e {

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ int f338425d = 0;

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final com.avito.beduin.v2.utils.filepicker.b f338426a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final n f338427b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.l
    public f f338428c;

    /* compiled from: AndroidFilePicker.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class a extends H implements Y41.l<Uri, G0> {
        @Override // Y41.l
        public final G0 invoke(Uri uri) {
            c cVar = (c) this.receiver;
            int i12 = c.f338425d;
            cVar.c(uri);
            return G0.f406611a;
        }
    }

    /* compiled from: AndroidFilePicker.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class b extends H implements Y41.l<Boolean, G0> {
        @Override // Y41.l
        public final G0 invoke(Boolean bool) {
            c.a((c) this.receiver, bool.booleanValue());
            return G0.f406611a;
        }
    }

    /* compiled from: AndroidFilePicker.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.beduin.v2.utils.filepicker.c$c, reason: collision with other inner class name */
    public /* synthetic */ class C10488c extends H implements Y41.l<Uri, G0> {
        @Override // Y41.l
        public final G0 invoke(Uri uri) {
            c cVar = (c) this.receiver;
            int i12 = c.f338425d;
            cVar.c(uri);
            return G0.f406611a;
        }
    }

    /* compiled from: AndroidFilePicker.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class d extends H implements Y41.l<Boolean, G0> {
        @Override // Y41.l
        public final G0 invoke(Boolean bool) {
            c.a((c) this.receiver, bool.booleanValue());
            return G0.f406611a;
        }
    }

    /* compiled from: AndroidFilePicker.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/avito/beduin/v2/utils/filepicker/c$e;", "", "<init>", "()V", "", "TAG", "Ljava/lang/String;", "file-picker_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class e {
        public /* synthetic */ e(C42822w c42822w) {
            this();
        }

        public e() {
        }
    }

    static {
        new e(null);
    }

    public /* synthetic */ c(Fragment fragment, f fVar, int i12, C42822w c42822w) {
        this(fragment, (i12 & 2) != 0 ? null : fVar);
    }

    public static final void a(c cVar, boolean z12) {
        if (z12) {
            f fVar = cVar.f338428c;
            cVar.c(fVar != null ? fVar.f338429a : null);
            return;
        }
        cVar.c(null);
        RU0.b bVar = RU0.b.f14467a;
        LogLevel[] logLevelArr = LogLevel.f337864b;
        bVar.getClass();
        if (1 >= RU0.b.f14469c) {
            RU0.b.f14468b.d(RU0.b.f14470d + ":FilePicker", "Failed to save camera's output");
        }
    }

    public final Uri b() throws IOException {
        n nVar = this.f338427b;
        Uri uriForFile = FileProvider.getUriForFile(nVar, nVar.getPackageName() + ".fileprovider", File.createTempFile("beduin_", null, nVar.getCacheDir()));
        f fVar = this.f338428c;
        if (fVar != null) {
            fVar.f338429a = uriForFile;
        }
        return uriForFile;
    }

    public final void c(Uri uri) {
        String string;
        Cursor cursorQuery;
        if (this.f338428c == null) {
            RU0.b bVar = RU0.b.f14467a;
            LogLevel[] logLevelArr = LogLevel.f337864b;
            bVar.getClass();
            if (1 >= RU0.b.f14469c) {
                RU0.b.f14468b.d(RU0.b.f14470d + ":FilePicker", "PendingResult is null. Unable to handle activity result");
            }
        }
        f fVar = this.f338428c;
        if (fVar != null) {
            if (uri != null) {
                com.avito.beduin.v2.interaction.flow.file_picker.flow.g gVar = fVar.f338430b;
                String[] strArr = {"_display_name", "_size"};
                List<String> pathSegments = uri.getPathSegments();
                int i12 = 0;
                boolean z12 = pathSegments.size() >= 2 && "tree".equals(pathSegments.get(0));
                if (z12 || (cursorQuery = this.f338427b.getContentResolver().query(uri, strArr, null, null, null)) == null) {
                    string = null;
                } else {
                    Cursor cursor = cursorQuery;
                    try {
                        Cursor cursor2 = cursor;
                        if (cursor2.moveToFirst()) {
                            string = cursor2.getString(0);
                            i12 = cursor2.getInt(1);
                        } else {
                            string = null;
                        }
                        G0 g02 = G0.f406611a;
                        kotlin.io.c.a(cursor, null);
                    } finally {
                    }
                }
                if (string == null) {
                    String path = uri.getPath();
                    String strN0 = path != null ? C43066x.n0(':', path, C43066x.n0('/', path, path)) : null;
                    string = ((strN0 == null || strN0.length() == 0) && z12) ? "/" : "";
                }
                gVar.a(new com.avito.beduin.v2.interaction.flow.file_picker.flow.h(uri.toString(), string, C43066x.o0(string, ".", ""), i12));
            } else {
                fVar.f338430b.onCancel();
            }
        }
        this.f338428c = null;
    }

    @Y61.k
    public final f d(@Y61.k com.avito.beduin.v2.interaction.flow.file_picker.flow.l lVar, @Y61.k com.avito.beduin.v2.interaction.flow.file_picker.flow.g gVar) {
        f fVar = new f();
        fVar.f338430b = gVar;
        this.f338428c = fVar;
        boolean z12 = lVar instanceof com.avito.beduin.v2.interaction.flow.file_picker.flow.d;
        com.avito.beduin.v2.utils.filepicker.b bVar = this.f338426a;
        if (z12) {
            bVar.f338421a.b(((com.avito.beduin.v2.interaction.flow.file_picker.flow.d) lVar).f337404a);
        } else if (lVar instanceof com.avito.beduin.v2.interaction.flow.file_picker.flow.e) {
            bVar.f338422b.b(null);
        } else if (lVar instanceof com.avito.beduin.v2.interaction.flow.file_picker.flow.a) {
            bVar.f338423c.b(b());
        } else if (lVar instanceof com.avito.beduin.v2.interaction.flow.file_picker.flow.b) {
            bVar.f338424d.b(b());
        }
        return fVar;
    }

    public c(@Y61.k Fragment fragment, @Y61.l f fVar) {
        this.f338427b = fragment.requireActivity();
        b.a aVar = com.avito.beduin.v2.utils.filepicker.b.f338420e;
        final a aVar2 = new a(1, this, c.class, "handleResult", "handleResult(Landroid/net/Uri;)V", 0);
        final b bVar = new b(1, this, c.class, "handleCameraResult", "handleCameraResult(Z)V", 0);
        aVar.getClass();
        final int i12 = 0;
        final int i13 = 1;
        final int i14 = 2;
        final int i15 = 3;
        this.f338426a = new com.avito.beduin.v2.utils.filepicker.b(fragment.registerForActivityResult(new b.c(), new androidx.view.result.a() { // from class: com.avito.beduin.v2.utils.filepicker.a
            @Override // androidx.view.result.a
            public final void a(Object obj) {
                switch (i12) {
                    case 0:
                        aVar2.invoke((Uri) obj);
                        break;
                    case 1:
                        aVar2.invoke((Uri) obj);
                        break;
                    case 2:
                        aVar2.invoke((Boolean) obj);
                        break;
                    case 3:
                        aVar2.invoke((Boolean) obj);
                        break;
                    case 4:
                        aVar2.invoke((Uri) obj);
                        break;
                    case 5:
                        aVar2.invoke((Uri) obj);
                        break;
                    case 6:
                        aVar2.invoke((Boolean) obj);
                        break;
                    default:
                        aVar2.invoke((Boolean) obj);
                        break;
                }
            }
        }), fragment.registerForActivityResult(new b.f(), new androidx.view.result.a() { // from class: com.avito.beduin.v2.utils.filepicker.a
            @Override // androidx.view.result.a
            public final void a(Object obj) {
                switch (i13) {
                    case 0:
                        aVar2.invoke((Uri) obj);
                        break;
                    case 1:
                        aVar2.invoke((Uri) obj);
                        break;
                    case 2:
                        aVar2.invoke((Boolean) obj);
                        break;
                    case 3:
                        aVar2.invoke((Boolean) obj);
                        break;
                    case 4:
                        aVar2.invoke((Uri) obj);
                        break;
                    case 5:
                        aVar2.invoke((Uri) obj);
                        break;
                    case 6:
                        aVar2.invoke((Boolean) obj);
                        break;
                    default:
                        aVar2.invoke((Boolean) obj);
                        break;
                }
            }
        }), fragment.registerForActivityResult(new b.o(), new androidx.view.result.a() { // from class: com.avito.beduin.v2.utils.filepicker.a
            @Override // androidx.view.result.a
            public final void a(Object obj) {
                switch (i14) {
                    case 0:
                        bVar.invoke((Uri) obj);
                        break;
                    case 1:
                        bVar.invoke((Uri) obj);
                        break;
                    case 2:
                        bVar.invoke((Boolean) obj);
                        break;
                    case 3:
                        bVar.invoke((Boolean) obj);
                        break;
                    case 4:
                        bVar.invoke((Uri) obj);
                        break;
                    case 5:
                        bVar.invoke((Uri) obj);
                        break;
                    case 6:
                        bVar.invoke((Boolean) obj);
                        break;
                    default:
                        bVar.invoke((Boolean) obj);
                        break;
                }
            }
        }), fragment.registerForActivityResult(new b.a(), new androidx.view.result.a() { // from class: com.avito.beduin.v2.utils.filepicker.a
            @Override // androidx.view.result.a
            public final void a(Object obj) {
                switch (i15) {
                    case 0:
                        bVar.invoke((Uri) obj);
                        break;
                    case 1:
                        bVar.invoke((Uri) obj);
                        break;
                    case 2:
                        bVar.invoke((Boolean) obj);
                        break;
                    case 3:
                        bVar.invoke((Boolean) obj);
                        break;
                    case 4:
                        bVar.invoke((Uri) obj);
                        break;
                    case 5:
                        bVar.invoke((Uri) obj);
                        break;
                    case 6:
                        bVar.invoke((Boolean) obj);
                        break;
                    default:
                        bVar.invoke((Boolean) obj);
                        break;
                }
            }
        }));
        this.f338428c = fVar;
    }

    public /* synthetic */ c(n nVar, f fVar, int i12, C42822w c42822w) {
        this(nVar, (i12 & 2) != 0 ? null : fVar);
    }

    public c(@Y61.k n nVar, @Y61.l f fVar) {
        this.f338427b = nVar;
        b.a aVar = com.avito.beduin.v2.utils.filepicker.b.f338420e;
        final C10488c c10488c = new C10488c(1, this, c.class, "handleResult", "handleResult(Landroid/net/Uri;)V", 0);
        final d dVar = new d(1, this, c.class, "handleCameraResult", "handleCameraResult(Z)V", 0);
        aVar.getClass();
        final int i12 = 4;
        final int i13 = 5;
        final int i14 = 6;
        final int i15 = 7;
        this.f338426a = new com.avito.beduin.v2.utils.filepicker.b(nVar.registerForActivityResult(new b.c(), new androidx.view.result.a() { // from class: com.avito.beduin.v2.utils.filepicker.a
            @Override // androidx.view.result.a
            public final void a(Object obj) {
                switch (i12) {
                    case 0:
                        c10488c.invoke((Uri) obj);
                        break;
                    case 1:
                        c10488c.invoke((Uri) obj);
                        break;
                    case 2:
                        c10488c.invoke((Boolean) obj);
                        break;
                    case 3:
                        c10488c.invoke((Boolean) obj);
                        break;
                    case 4:
                        c10488c.invoke((Uri) obj);
                        break;
                    case 5:
                        c10488c.invoke((Uri) obj);
                        break;
                    case 6:
                        c10488c.invoke((Boolean) obj);
                        break;
                    default:
                        c10488c.invoke((Boolean) obj);
                        break;
                }
            }
        }), nVar.registerForActivityResult(new b.f(), new androidx.view.result.a() { // from class: com.avito.beduin.v2.utils.filepicker.a
            @Override // androidx.view.result.a
            public final void a(Object obj) {
                switch (i13) {
                    case 0:
                        c10488c.invoke((Uri) obj);
                        break;
                    case 1:
                        c10488c.invoke((Uri) obj);
                        break;
                    case 2:
                        c10488c.invoke((Boolean) obj);
                        break;
                    case 3:
                        c10488c.invoke((Boolean) obj);
                        break;
                    case 4:
                        c10488c.invoke((Uri) obj);
                        break;
                    case 5:
                        c10488c.invoke((Uri) obj);
                        break;
                    case 6:
                        c10488c.invoke((Boolean) obj);
                        break;
                    default:
                        c10488c.invoke((Boolean) obj);
                        break;
                }
            }
        }), nVar.registerForActivityResult(new b.o(), new androidx.view.result.a() { // from class: com.avito.beduin.v2.utils.filepicker.a
            @Override // androidx.view.result.a
            public final void a(Object obj) {
                switch (i14) {
                    case 0:
                        dVar.invoke((Uri) obj);
                        break;
                    case 1:
                        dVar.invoke((Uri) obj);
                        break;
                    case 2:
                        dVar.invoke((Boolean) obj);
                        break;
                    case 3:
                        dVar.invoke((Boolean) obj);
                        break;
                    case 4:
                        dVar.invoke((Uri) obj);
                        break;
                    case 5:
                        dVar.invoke((Uri) obj);
                        break;
                    case 6:
                        dVar.invoke((Boolean) obj);
                        break;
                    default:
                        dVar.invoke((Boolean) obj);
                        break;
                }
            }
        }), nVar.registerForActivityResult(new b.a(), new androidx.view.result.a() { // from class: com.avito.beduin.v2.utils.filepicker.a
            @Override // androidx.view.result.a
            public final void a(Object obj) {
                switch (i15) {
                    case 0:
                        dVar.invoke((Uri) obj);
                        break;
                    case 1:
                        dVar.invoke((Uri) obj);
                        break;
                    case 2:
                        dVar.invoke((Boolean) obj);
                        break;
                    case 3:
                        dVar.invoke((Boolean) obj);
                        break;
                    case 4:
                        dVar.invoke((Uri) obj);
                        break;
                    case 5:
                        dVar.invoke((Uri) obj);
                        break;
                    case 6:
                        dVar.invoke((Boolean) obj);
                        break;
                    default:
                        dVar.invoke((Boolean) obj);
                        break;
                }
            }
        }));
        this.f338428c = fVar;
    }
}
