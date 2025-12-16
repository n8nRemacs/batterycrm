package com.avito.android.video_picker.camera_request;

import Y61.k;
import Y61.l;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import com.avito.android.R;
import com.avito.android.analytics.screens.InterfaceC28477j;
import com.avito.android.lib.design.button.Button;
import kotlin.C42727D;
import kotlin.InterfaceC42726C;
import kotlin.Metadata;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;

/* compiled from: CameraRequestActivity.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0005B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/avito/android/video_picker/camera_request/CameraRequestActivity;", "Lcom/avito/android/ui/activity/a;", "Lcom/avito/android/analytics/screens/j$a;", "<init>", "()V", "a", "_avito_video-picker_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class CameraRequestActivity extends com.avito.android.ui.activity.a implements InterfaceC28477j.a {

    /* renamed from: o, reason: collision with root package name */
    public static final /* synthetic */ int f325962o = 0;

    /* renamed from: m, reason: collision with root package name */
    @k
    public final InterfaceC42726C f325963m = C42727D.c(new b());

    /* renamed from: n, reason: collision with root package name */
    @k
    public final InterfaceC42726C f325964n = C42727D.c(new c());

    /* compiled from: CameraRequestActivity.kt */
    @s0
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/video_picker/camera_request/CameraRequestActivity$a;", "", "<init>", "()V", "_avito_video-picker_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
    }

    /* compiled from: CameraRequestActivity.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u0001H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "Landroid/widget/ImageView;", "kotlin.jvm.PlatformType", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class b extends N implements Y41.a<ImageView> {
        public b() {
            super(0);
        }

        @Override // Y41.a
        public final ImageView invoke() {
            return (ImageView) CameraRequestActivity.this.findViewById(R.id.close_button);
        }
    }

    /* compiled from: CameraRequestActivity.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u0001H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "Lcom/avito/android/lib/design/button/Button;", "kotlin.jvm.PlatformType", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class c extends N implements Y41.a<Button> {
        public c() {
            super(0);
        }

        @Override // Y41.a
        public final Button invoke() {
            return (Button) CameraRequestActivity.this.findViewById(R.id.permission_request_button);
        }
    }

    @Override // com.avito.android.ui.activity.a, androidx.fragment.app.ActivityC22955m, androidx.view.n, androidx.core.app.ActivityC22757o, android.app.Activity
    public final void onCreate(@l Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.video_picker_camera_request_activity);
        final int i12 = 0;
        ((ImageView) this.f325963m.getValue()).setOnClickListener(new View.OnClickListener(this) { // from class: com.avito.android.video_picker.camera_request.a

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ CameraRequestActivity f325968c;

            {
                this.f325968c = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                CameraRequestActivity cameraRequestActivity = this.f325968c;
                switch (i12) {
                    case 0:
                        int i13 = CameraRequestActivity.f325962o;
                        cameraRequestActivity.finish();
                        break;
                    default:
                        int i14 = CameraRequestActivity.f325962o;
                        Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
                        intent.setData(Uri.fromParts("package", cameraRequestActivity.getPackageName(), null));
                        cameraRequestActivity.startActivity(intent);
                        break;
                }
            }
        });
        final int i13 = 1;
        ((Button) this.f325964n.getValue()).setOnClickListener(new View.OnClickListener(this) { // from class: com.avito.android.video_picker.camera_request.a

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ CameraRequestActivity f325968c;

            {
                this.f325968c = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                CameraRequestActivity cameraRequestActivity = this.f325968c;
                switch (i13) {
                    case 0:
                        int i132 = CameraRequestActivity.f325962o;
                        cameraRequestActivity.finish();
                        break;
                    default:
                        int i14 = CameraRequestActivity.f325962o;
                        Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
                        intent.setData(Uri.fromParts("package", cameraRequestActivity.getPackageName(), null));
                        cameraRequestActivity.startActivity(intent);
                        break;
                }
            }
        });
    }

    @Override // com.avito.android.ui.activity.a, androidx.appcompat.app.m, androidx.fragment.app.ActivityC22955m, android.app.Activity
    public final void onStart() {
        super.onStart();
        if (checkSelfPermission("android.permission.CAMERA") == 0) {
            finish();
        }
    }
}
