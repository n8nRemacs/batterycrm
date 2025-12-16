package defpackage;

import android.content.ClipData;
import android.content.Context;
import android.media.ApplicationMediaCapabilities;
import android.media.AudioProfile;
import android.media.MediaRecorder;
import android.view.ContentInfo;

/* loaded from: classes.dex */
public abstract /* synthetic */ class q20 {
    public static /* synthetic */ ApplicationMediaCapabilities.Builder c() {
        return new ApplicationMediaCapabilities.Builder();
    }

    public static /* bridge */ /* synthetic */ AudioProfile g(Object obj) {
        return (AudioProfile) obj;
    }

    public static /* synthetic */ MediaRecorder h(Context context) {
        return new MediaRecorder(context);
    }

    public static /* synthetic */ ContentInfo.Builder i(ClipData clipData, int i) {
        return new ContentInfo.Builder(clipData, i);
    }

    public static /* bridge */ /* synthetic */ ContentInfo k(Object obj) {
        return (ContentInfo) obj;
    }

    public static /* synthetic */ void o() {
    }
}
