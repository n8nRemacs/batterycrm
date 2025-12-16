package com.avito.android.lib.beduin_v2.component.map;

import android.view.LayoutInflater;
import com.avito.beduin.v2.avito.component.common.Corner;
import com.avito.beduin.v2.avito.component.map.state.RemotePinView;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.s0;

/* compiled from: RemotePinBitmapFactory.kt */
@s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/lib/beduin_v2/component/map/m;", "", "<init>", "()V", "_design-modules_beduin-v2_renderer_component_map"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class m {

    /* renamed from: a, reason: collision with root package name */
    @Y61.l
    public LayoutInflater f175863a;

    /* compiled from: RemotePinBitmapFactory.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f175864a;

        static {
            int[] iArr = new int[RemotePinView.RemotePinText.Position.values().length];
            try {
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                RemotePinView.RemotePinText.Position position = RemotePinView.RemotePinText.Position.f334660c;
                iArr[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                RemotePinView.RemotePinText.Position position2 = RemotePinView.RemotePinText.Position.f334660c;
                iArr[2] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                RemotePinView.RemotePinText.Position position3 = RemotePinView.RemotePinText.Position.f334660c;
                iArr[3] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                RemotePinView.RemotePinText.Position position4 = RemotePinView.RemotePinText.Position.f334660c;
                iArr[4] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            int[] iArr2 = new int[Corner.Type.values().length];
            try {
                iArr2[0] = 1;
            } catch (NoSuchFieldError unused6) {
            }
            f175864a = iArr2;
        }
    }

    public static void a(Corner.Type type) {
        if (a.f175864a[type.ordinal()] != 1) {
            throw new NoWhenBranchMatchedException();
        }
    }
}
