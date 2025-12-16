package eN0;

import C11.b;
import Y41.l;
import Y61.k;
import android.net.Uri;
import com.avito.android.di.InterfaceC29971h;
import com.avito.android.di.InterfaceC30272y;
import com.avito.android.video_picker.VideoPickerActivity;
import kotlin.G0;
import kotlin.Metadata;

/* compiled from: VideoPickerComponent.kt */
@C11.b
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bg\u0018\u00002\u00020\u0001:\u0002\u0002\u0003¨\u0006\u0004"}, d2 = {"LeN0/a;", "", "a", "b", "_avito_video-picker_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
@InterfaceC30272y
/* renamed from: eN0.a, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public interface InterfaceC40026a {

    /* compiled from: VideoPickerComponent.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bg\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LeN0/a$a;", "Lcom/avito/android/di/h;", "_avito_video-picker_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @C11.c
    /* renamed from: eN0.a$a, reason: collision with other inner class name */
    public interface InterfaceC11077a extends InterfaceC29971h {
        @k
        b fh();
    }

    /* compiled from: VideoPickerComponent.kt */
    @b.a
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bg\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LeN0/a$b;", "", "_avito_video-picker_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: eN0.a$b */
    public interface b {
        @k
        InterfaceC40026a a(@h31.b @k l<? super Uri, G0> lVar);
    }

    void a(@k VideoPickerActivity videoPickerActivity);
}
