package com.avito.android.video_picker;

import Cd.C13243a;
import android.content.Context;
import android.content.Intent;
import android.database.Cursor;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.provider.MediaStore;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.view.Lifecycle;
import androidx.view.O0;
import androidx.view.P0;
import androidx.view.S0;
import com.avito.android.R;
import com.avito.android.analytics.screens.InterfaceC28477j;
import com.avito.android.di.C29972i;
import com.avito.android.lib.design.button.Button;
import com.avito.android.remote.model.messenger.voice.VoiceInfo;
import com.avito.android.util.D6;
import com.avito.android.video_picker.camera_request.CameraRequestActivity;
import eN0.InterfaceC40026a;
import fN0.InterfaceC40321a;
import fN0.InterfaceC40323c;
import gN0.C40604a;
import i.AbstractC41201a;
import i.b;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import javax.inject.Inject;
import kotlin.C42727D;
import kotlin.G0;
import kotlin.InterfaceC42726C;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.H;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.m0;
import kotlin.jvm.internal.s0;
import z1.AbstractC50339a;

/* compiled from: VideoPickerActivity.kt */
@s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u00012\u00020\u0002:\u0003\u0005\u0006\u0007B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\b"}, d2 = {"Lcom/avito/android/video_picker/VideoPickerActivity;", "Lcom/avito/android/ui/activity/a;", "Lcom/avito/android/analytics/screens/j$a;", "<init>", "()V", "a", "b", "c", "_avito_video-picker_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class VideoPickerActivity extends com.avito.android.ui.activity.a implements InterfaceC28477j.a {

    /* renamed from: z, reason: collision with root package name */
    public static final /* synthetic */ int f325930z = 0;

    /* renamed from: m, reason: collision with root package name */
    @Inject
    public com.avito.android.video_picker.j f325931m;

    /* renamed from: o, reason: collision with root package name */
    @Inject
    public com.avito.konveyor.adapter.j f325933o;

    /* renamed from: p, reason: collision with root package name */
    @Inject
    public com.avito.konveyor.adapter.a f325934p;

    /* renamed from: q, reason: collision with root package name */
    @Inject
    public com.avito.android.video_picker.util.a f325935q;

    /* renamed from: w, reason: collision with root package name */
    @Y61.k
    public final androidx.view.result.h<G0> f325941w;

    /* renamed from: x, reason: collision with root package name */
    @Y61.k
    public final androidx.view.result.h<String> f325942x;

    /* renamed from: y, reason: collision with root package name */
    @Y61.k
    public final androidx.view.result.h<String[]> f325943y;

    /* renamed from: n, reason: collision with root package name */
    @Y61.k
    public final O0 f325932n = new O0(m0.f406844a.b(com.avito.android.video_picker.i.class), new k(), new j(new o()), new l());

    /* renamed from: r, reason: collision with root package name */
    @Y61.k
    public final InterfaceC42726C f325936r = C42727D.c(new h());

    /* renamed from: s, reason: collision with root package name */
    @Y61.k
    public final InterfaceC42726C f325937s = C42727D.c(new d());

    /* renamed from: t, reason: collision with root package name */
    @Y61.k
    public final InterfaceC42726C f325938t = C42727D.c(new m());

    /* renamed from: u, reason: collision with root package name */
    @Y61.k
    public final InterfaceC42726C f325939u = C42727D.c(new g());

    /* renamed from: v, reason: collision with root package name */
    @Y61.k
    public final InterfaceC42726C f325940v = C42727D.c(new n());

    /* compiled from: VideoPickerActivity.kt */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lcom/avito/android/video_picker/VideoPickerActivity$a;", "", "<init>", "()V", "", "MAX_VIDEO_DURATION_SEC", "I", "REQUEST_VIDEO_CAPTURE", "", "VIDEO_PICKER_UPLOAD_VIDEO_LIMITS_KEY", "Ljava/lang/String;", "_avito_video-picker_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    /* compiled from: VideoPickerActivity.kt */
    @s0
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/video_picker/VideoPickerActivity$b;", "", "<init>", "()V", "_avito_video-picker_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class b {
    }

    /* compiled from: VideoPickerActivity.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0002\u0018\u00002\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0001B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/video_picker/VideoPickerActivity$c;", "Li/a;", "Lkotlin/G0;", "Landroid/net/Uri;", "<init>", "()V", "_avito_video-picker_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class c extends AbstractC41201a<G0, Uri> {
        @Override // i.AbstractC41201a
        public final Intent createIntent(Context context, G0 g02) {
            Intent intent = new Intent("android.media.action.VIDEO_CAPTURE");
            intent.putExtra("android.intent.extra.durationLimit", 180);
            return intent;
        }

        @Override // i.AbstractC41201a
        public final Uri parseResult(int i12, Intent intent) {
            if (i12 != -1 || intent == null) {
                return null;
            }
            return intent.getData();
        }
    }

    /* compiled from: VideoPickerActivity.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u0001H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "Landroid/widget/ImageView;", "kotlin.jvm.PlatformType", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class d extends N implements Y41.a<ImageView> {
        public d() {
            super(0);
        }

        @Override // Y41.a
        public final ImageView invoke() {
            return (ImageView) VideoPickerActivity.this.findViewById(R.id.close_button);
        }
    }

    /* compiled from: VideoPickerActivity.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class e extends H implements Y41.l<InterfaceC40323c, G0> {
        @Override // Y41.l
        public final G0 invoke(InterfaceC40323c interfaceC40323c) throws IllegalArgumentException {
            InterfaceC40323c interfaceC40323c2 = interfaceC40323c;
            VideoPickerActivity videoPickerActivity = (VideoPickerActivity) this.receiver;
            int i12 = VideoPickerActivity.f325930z;
            videoPickerActivity.getClass();
            if (interfaceC40323c2 instanceof InterfaceC40323c.a) {
                com.avito.android.video_picker.util.a aVar = videoPickerActivity.f325935q;
                if (aVar == null) {
                    aVar = null;
                }
                VideoUploadLimits videoUploadLimits = (VideoUploadLimits) videoPickerActivity.getIntent().getParcelableExtra("video_picker_upload_video_limits_key");
                aVar.getClass();
                Cursor cursorQuery = videoPickerActivity.getContentResolver().query(Build.VERSION.SDK_INT >= 29 ? MediaStore.Video.Media.getContentUri("external") : MediaStore.Video.Media.getContentUri("external"), new String[]{"_id", "duration", "_size"}, null, null, null);
                ArrayList arrayList = new ArrayList();
                if (cursorQuery != null && true == cursorQuery.moveToFirst()) {
                    int columnIndexOrThrow = cursorQuery.getColumnIndexOrThrow("_id");
                    int columnIndexOrThrow2 = cursorQuery.getColumnIndexOrThrow("duration");
                    int columnIndexOrThrow3 = cursorQuery.getColumnIndexOrThrow("_size");
                    do {
                        arrayList.add(new com.avito.android.video_picker.ui.item.video_card.c(String.valueOf(cursorQuery.getLong(columnIndexOrThrow)), cursorQuery.getLong(columnIndexOrThrow2), cursorQuery.getLong(columnIndexOrThrow3), videoUploadLimits != null ? videoUploadLimits.f325956c : null, videoUploadLimits != null ? videoUploadLimits.f325957d : null, videoUploadLimits != null ? videoUploadLimits.f325955b : null));
                    } while (cursorQuery.moveToNext());
                }
                ((com.avito.android.video_picker.i) videoPickerActivity.f325932n.getValue()).accept(new InterfaceC40321a.c(C42745f0.q0(arrayList)));
            } else {
                boolean z12 = interfaceC40323c2 instanceof InterfaceC40323c.C11150c;
                InterfaceC42726C interfaceC42726C = videoPickerActivity.f325939u;
                InterfaceC42726C interfaceC42726C2 = videoPickerActivity.f325940v;
                InterfaceC42726C interfaceC42726C3 = videoPickerActivity.f325938t;
                if (z12) {
                    D6.w(videoPickerActivity.a2());
                    D6.w((Button) interfaceC42726C2.getValue());
                    D6.H((Button) interfaceC42726C.getValue());
                    D6.H((TextView) interfaceC42726C3.getValue());
                    ((TextView) interfaceC42726C3.getValue()).setText(R.string.video_picker_status_permisiion);
                    int i13 = Build.VERSION.SDK_INT;
                    androidx.view.result.h<String[]> hVar = videoPickerActivity.f325943y;
                    if (i13 >= 34) {
                        hVar.b(new String[]{"android.permission.READ_MEDIA_VIDEO", "android.permission.READ_MEDIA_VISUAL_USER_SELECTED"});
                    } else if (i13 >= 33) {
                        hVar.b(new String[]{"android.permission.READ_MEDIA_VIDEO"});
                    } else {
                        hVar.b(new String[]{"android.permission.READ_EXTERNAL_STORAGE"});
                    }
                } else if (interfaceC40323c2 instanceof InterfaceC40323c.b) {
                    D6.w(videoPickerActivity.a2());
                    D6.w((Button) interfaceC42726C.getValue());
                    D6.H((TextView) interfaceC42726C3.getValue());
                    D6.H((Button) interfaceC42726C2.getValue());
                    ((TextView) interfaceC42726C3.getValue()).setText(R.string.video_picker_status_empty);
                }
            }
            return G0.f406611a;
        }
    }

    /* compiled from: VideoPickerActivity.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"LfN0/d;", VoiceInfo.STATE, "Lkotlin/G0;", "invoke", "(LfN0/d;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class f extends N implements Y41.l<fN0.d, G0> {
        public f() {
            super(1);
        }

        @Override // Y41.l
        public final G0 invoke(fN0.d dVar) {
            int i12 = VideoPickerActivity.f325930z;
            VideoPickerActivity videoPickerActivity = VideoPickerActivity.this;
            List<com.avito.android.video_picker.ui.item.video_card.c> list = dVar.f395877a;
            if (!list.isEmpty()) {
                D6.H(videoPickerActivity.a2());
                D6.w((TextView) videoPickerActivity.f325938t.getValue());
                D6.w((Button) videoPickerActivity.f325939u.getValue());
                D6.w((Button) videoPickerActivity.f325940v.getValue());
            }
            com.avito.konveyor.adapter.a aVar = videoPickerActivity.f325934p;
            if (aVar == null) {
                aVar = null;
            }
            com.avito.android.authorization.auto_recovery.phone_confirm.b.p(aVar, list);
            com.avito.konveyor.adapter.j jVar = videoPickerActivity.f325933o;
            (jVar != null ? jVar : null).notifyDataSetChanged();
            return G0.f406611a;
        }
    }

    /* compiled from: VideoPickerActivity.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u0001H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "Lcom/avito/android/lib/design/button/Button;", "kotlin.jvm.PlatformType", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class g extends N implements Y41.a<Button> {
        public g() {
            super(0);
        }

        @Override // Y41.a
        public final Button invoke() {
            return (Button) VideoPickerActivity.this.findViewById(R.id.permission_request_button);
        }
    }

    /* compiled from: VideoPickerActivity.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u0001H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "Landroidx/recyclerview/widget/RecyclerView;", "kotlin.jvm.PlatformType", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class h extends N implements Y41.a<RecyclerView> {
        public h() {
            super(0);
        }

        @Override // Y41.a
        public final RecyclerView invoke() {
            return (RecyclerView) VideoPickerActivity.this.findViewById(R.id.videos_list);
        }
    }

    /* compiled from: VideoPickerActivity.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroid/net/Uri;", "videoUri", "Lkotlin/G0;", "invoke", "(Landroid/net/Uri;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class i extends N implements Y41.l<Uri, G0> {
        public i() {
            super(1);
        }

        @Override // Y41.l
        public final G0 invoke(Uri uri) {
            Intent intent = new Intent();
            intent.setData(uri);
            VideoPickerActivity videoPickerActivity = VideoPickerActivity.this;
            videoPickerActivity.setResult(-1, intent);
            videoPickerActivity.finish();
            return G0.f406611a;
        }
    }

    /* compiled from: LazyViewModelFactory.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "T", "Landroidx/lifecycle/P0$c;", "invoke", "()Landroidx/lifecycle/P0$c;", "Cd/n", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class j extends N implements Y41.a<P0.c> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Y41.a f325949l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public j(Y41.a aVar) {
            super(0);
            this.f325949l = aVar;
        }

        @Override // Y41.a
        public final P0.c invoke() {
            return new C13243a(this.f325949l);
        }
    }

    /* compiled from: ActivityViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Landroidx/lifecycle/S0;", "invoke", "()Landroidx/lifecycle/S0;", "Cd/g", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class k extends N implements Y41.a<S0> {
        public k() {
            super(0);
        }

        @Override // Y41.a
        public final S0 invoke() {
            return VideoPickerActivity.this.getF42820b();
        }
    }

    /* compiled from: ActivityViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Lz1/a;", "invoke", "()Lz1/a;", "Cd/h", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class l extends N implements Y41.a<AbstractC50339a> {
        public l() {
            super(0);
        }

        @Override // Y41.a
        public final AbstractC50339a invoke() {
            return VideoPickerActivity.this.getDefaultViewModelCreationExtras();
        }
    }

    /* compiled from: VideoPickerActivity.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u0001H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "Landroid/widget/TextView;", "kotlin.jvm.PlatformType", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class m extends N implements Y41.a<TextView> {
        public m() {
            super(0);
        }

        @Override // Y41.a
        public final TextView invoke() {
            return (TextView) VideoPickerActivity.this.findViewById(R.id.status_text);
        }
    }

    /* compiled from: VideoPickerActivity.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u0001H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "Lcom/avito/android/lib/design/button/Button;", "kotlin.jvm.PlatformType", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class n extends N implements Y41.a<Button> {
        public n() {
            super(0);
        }

        @Override // Y41.a
        public final Button invoke() {
            return (Button) VideoPickerActivity.this.findViewById(R.id.record_video_button);
        }
    }

    /* compiled from: VideoPickerActivity.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0004\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/avito/android/video_picker/i;", "kotlin.jvm.PlatformType", "invoke", "()Lcom/avito/android/video_picker/i;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class o extends N implements Y41.a<com.avito.android.video_picker.i> {
        public o() {
            super(0);
        }

        @Override // Y41.a
        public final com.avito.android.video_picker.i invoke() {
            com.avito.android.video_picker.j jVar = VideoPickerActivity.this.f325931m;
            if (jVar == null) {
                jVar = null;
            }
            return (com.avito.android.video_picker.i) jVar.get();
        }
    }

    static {
        new a(null);
    }

    public VideoPickerActivity() {
        final int i12 = 0;
        this.f325941w = registerForActivityResult(new c(), new androidx.view.result.a(this) { // from class: com.avito.android.video_picker.c

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ VideoPickerActivity f325961c;

            {
                this.f325961c = this;
            }

            @Override // androidx.view.result.a
            public final void a(Object obj) {
                Object next;
                VideoPickerActivity videoPickerActivity = this.f325961c;
                switch (i12) {
                    case 0:
                        Uri uri = (Uri) obj;
                        int i13 = VideoPickerActivity.f325930z;
                        if (uri != null) {
                            Intent intent = new Intent();
                            intent.setData(uri);
                            videoPickerActivity.setResult(-1, intent);
                            videoPickerActivity.finish();
                            break;
                        }
                        break;
                    case 1:
                        boolean zBooleanValue = ((Boolean) obj).booleanValue();
                        int i14 = VideoPickerActivity.f325930z;
                        if (!zBooleanValue) {
                            new CameraRequestActivity.a();
                            videoPickerActivity.startActivity(new Intent(videoPickerActivity, (Class<?>) CameraRequestActivity.class));
                            break;
                        } else {
                            videoPickerActivity.f325941w.b(G0.f406611a);
                            break;
                        }
                    default:
                        int i15 = VideoPickerActivity.f325930z;
                        Iterator it = ((Map) obj).values().iterator();
                        while (true) {
                            if (it.hasNext()) {
                                next = it.next();
                                if (((Boolean) next).booleanValue()) {
                                }
                            } else {
                                next = null;
                            }
                        }
                        if (next != null) {
                            ((i) videoPickerActivity.f325932n.getValue()).accept(InterfaceC40321a.C11148a.f395866a);
                            break;
                        }
                        break;
                }
            }
        });
        final int i13 = 1;
        this.f325942x = registerForActivityResult(new b.l(), new androidx.view.result.a(this) { // from class: com.avito.android.video_picker.c

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ VideoPickerActivity f325961c;

            {
                this.f325961c = this;
            }

            @Override // androidx.view.result.a
            public final void a(Object obj) {
                Object next;
                VideoPickerActivity videoPickerActivity = this.f325961c;
                switch (i13) {
                    case 0:
                        Uri uri = (Uri) obj;
                        int i132 = VideoPickerActivity.f325930z;
                        if (uri != null) {
                            Intent intent = new Intent();
                            intent.setData(uri);
                            videoPickerActivity.setResult(-1, intent);
                            videoPickerActivity.finish();
                            break;
                        }
                        break;
                    case 1:
                        boolean zBooleanValue = ((Boolean) obj).booleanValue();
                        int i14 = VideoPickerActivity.f325930z;
                        if (!zBooleanValue) {
                            new CameraRequestActivity.a();
                            videoPickerActivity.startActivity(new Intent(videoPickerActivity, (Class<?>) CameraRequestActivity.class));
                            break;
                        } else {
                            videoPickerActivity.f325941w.b(G0.f406611a);
                            break;
                        }
                    default:
                        int i15 = VideoPickerActivity.f325930z;
                        Iterator it = ((Map) obj).values().iterator();
                        while (true) {
                            if (it.hasNext()) {
                                next = it.next();
                                if (((Boolean) next).booleanValue()) {
                                }
                            } else {
                                next = null;
                            }
                        }
                        if (next != null) {
                            ((i) videoPickerActivity.f325932n.getValue()).accept(InterfaceC40321a.C11148a.f395866a);
                            break;
                        }
                        break;
                }
            }
        });
        final int i14 = 2;
        this.f325943y = registerForActivityResult(new b.k(), new androidx.view.result.a(this) { // from class: com.avito.android.video_picker.c

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ VideoPickerActivity f325961c;

            {
                this.f325961c = this;
            }

            @Override // androidx.view.result.a
            public final void a(Object obj) {
                Object next;
                VideoPickerActivity videoPickerActivity = this.f325961c;
                switch (i14) {
                    case 0:
                        Uri uri = (Uri) obj;
                        int i132 = VideoPickerActivity.f325930z;
                        if (uri != null) {
                            Intent intent = new Intent();
                            intent.setData(uri);
                            videoPickerActivity.setResult(-1, intent);
                            videoPickerActivity.finish();
                            break;
                        }
                        break;
                    case 1:
                        boolean zBooleanValue = ((Boolean) obj).booleanValue();
                        int i142 = VideoPickerActivity.f325930z;
                        if (!zBooleanValue) {
                            new CameraRequestActivity.a();
                            videoPickerActivity.startActivity(new Intent(videoPickerActivity, (Class<?>) CameraRequestActivity.class));
                            break;
                        } else {
                            videoPickerActivity.f325941w.b(G0.f406611a);
                            break;
                        }
                    default:
                        int i15 = VideoPickerActivity.f325930z;
                        Iterator it = ((Map) obj).values().iterator();
                        while (true) {
                            if (it.hasNext()) {
                                next = it.next();
                                if (((Boolean) next).booleanValue()) {
                                }
                            } else {
                                next = null;
                            }
                        }
                        if (next != null) {
                            ((i) videoPickerActivity.f325932n.getValue()).accept(InterfaceC40321a.C11148a.f395866a);
                            break;
                        }
                        break;
                }
            }
        });
    }

    @Override // com.avito.android.ui.activity.a
    public final void Y1(@Y61.l Bundle bundle) {
        ((InterfaceC40026a.InterfaceC11077a) C29972i.a(C29972i.b(this), InterfaceC40026a.InterfaceC11077a.class)).fh().a(new i()).a(this);
    }

    public final RecyclerView a2() {
        return (RecyclerView) this.f325936r.getValue();
    }

    @Override // com.avito.android.ui.activity.a, androidx.fragment.app.ActivityC22955m, androidx.view.n, androidx.core.app.ActivityC22757o, android.app.Activity
    public final void onCreate(@Y61.l Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.video_picker_activity);
        com.avito.android.arch.mvi.android.f.a((com.avito.android.video_picker.i) this.f325932n.getValue(), this, Lifecycle.State.f46682e, new e(1, this, VideoPickerActivity.class, "handleEvent", "handleEvent(Lcom/avito/android/video_picker/mvi/entity/VideoPickerOneTimeEvent;)V", 0), new f());
        RecyclerView recyclerViewA2 = a2();
        com.avito.konveyor.adapter.j jVar = this.f325933o;
        if (jVar == null) {
            jVar = null;
        }
        recyclerViewA2.setAdapter(jVar);
        a2().setLayoutManager(new GridLayoutManager(2));
        a2().l(new C40604a(), -1);
        final int i12 = 0;
        ((ImageView) this.f325937s.getValue()).setOnClickListener(new View.OnClickListener(this) { // from class: com.avito.android.video_picker.b

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ VideoPickerActivity f325959c;

            {
                this.f325959c = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                VideoPickerActivity videoPickerActivity = this.f325959c;
                switch (i12) {
                    case 0:
                        int i13 = VideoPickerActivity.f325930z;
                        videoPickerActivity.finish();
                        break;
                    case 1:
                        int i14 = VideoPickerActivity.f325930z;
                        Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
                        intent.setData(Uri.fromParts("package", videoPickerActivity.getPackageName(), null));
                        videoPickerActivity.startActivity(intent);
                        break;
                    default:
                        int i15 = VideoPickerActivity.f325930z;
                        if (videoPickerActivity.checkSelfPermission("android.permission.CAMERA") != 0) {
                            videoPickerActivity.f325942x.b("android.permission.CAMERA");
                            break;
                        } else {
                            videoPickerActivity.f325941w.b(G0.f406611a);
                            break;
                        }
                }
            }
        });
        final int i13 = 1;
        ((Button) this.f325939u.getValue()).setOnClickListener(new View.OnClickListener(this) { // from class: com.avito.android.video_picker.b

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ VideoPickerActivity f325959c;

            {
                this.f325959c = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                VideoPickerActivity videoPickerActivity = this.f325959c;
                switch (i13) {
                    case 0:
                        int i132 = VideoPickerActivity.f325930z;
                        videoPickerActivity.finish();
                        break;
                    case 1:
                        int i14 = VideoPickerActivity.f325930z;
                        Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
                        intent.setData(Uri.fromParts("package", videoPickerActivity.getPackageName(), null));
                        videoPickerActivity.startActivity(intent);
                        break;
                    default:
                        int i15 = VideoPickerActivity.f325930z;
                        if (videoPickerActivity.checkSelfPermission("android.permission.CAMERA") != 0) {
                            videoPickerActivity.f325942x.b("android.permission.CAMERA");
                            break;
                        } else {
                            videoPickerActivity.f325941w.b(G0.f406611a);
                            break;
                        }
                }
            }
        });
        final int i14 = 2;
        ((Button) this.f325940v.getValue()).setOnClickListener(new View.OnClickListener(this) { // from class: com.avito.android.video_picker.b

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ VideoPickerActivity f325959c;

            {
                this.f325959c = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                VideoPickerActivity videoPickerActivity = this.f325959c;
                switch (i14) {
                    case 0:
                        int i132 = VideoPickerActivity.f325930z;
                        videoPickerActivity.finish();
                        break;
                    case 1:
                        int i142 = VideoPickerActivity.f325930z;
                        Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
                        intent.setData(Uri.fromParts("package", videoPickerActivity.getPackageName(), null));
                        videoPickerActivity.startActivity(intent);
                        break;
                    default:
                        int i15 = VideoPickerActivity.f325930z;
                        if (videoPickerActivity.checkSelfPermission("android.permission.CAMERA") != 0) {
                            videoPickerActivity.f325942x.b("android.permission.CAMERA");
                            break;
                        } else {
                            videoPickerActivity.f325941w.b(G0.f406611a);
                            break;
                        }
                }
            }
        });
    }

    @Override // com.avito.android.ui.activity.a, androidx.fragment.app.ActivityC22955m, android.app.Activity
    public final void onResume() {
        super.onResume();
        if (checkSelfPermission("android.permission.READ_EXTERNAL_STORAGE") == 0 || checkSelfPermission("android.permission.READ_MEDIA_VIDEO") == 0 || checkSelfPermission("android.permission.READ_MEDIA_VISUAL_USER_SELECTED") == 0) {
            ((com.avito.android.video_picker.i) this.f325932n.getValue()).accept(InterfaceC40321a.C11148a.f395866a);
        }
    }

    @Override // com.avito.android.ui.activity.a, androidx.appcompat.app.m, androidx.fragment.app.ActivityC22955m, android.app.Activity
    public final void onStart() {
        super.onStart();
        if (checkSelfPermission("android.permission.READ_EXTERNAL_STORAGE") == -1 && checkSelfPermission("android.permission.READ_MEDIA_VIDEO") == -1) {
            ((com.avito.android.video_picker.i) this.f325932n.getValue()).accept(InterfaceC40321a.b.f395867a);
        }
    }
}
