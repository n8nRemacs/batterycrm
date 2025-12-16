package i;

import android.annotation.SuppressLint;
import android.content.ClipData;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.ResolveInfo;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Build;
import android.os.ext.SdkExtensions;
import android.provider.MediaStore;
import androidx.view.result.ActivityResult;
import androidx.view.result.IntentSenderRequest;
import i.AbstractC41201a;
import j.InterfaceC42153i;
import j.X;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import kotlin.InterfaceC42830m;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.C42745f0;
import kotlin.collections.C42756l;
import kotlin.collections.C42784z0;
import kotlin.collections.P0;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.s0;

/* compiled from: ActivityResultContracts.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0014\u0018\u00002\u00020\u0001:\u0011\u0004\u0005\u0006\u0007\b\t\n\u000b\f\r\u000e\u000f\u0010\u0011\u0012\u0013\u0014B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0015"}, d2 = {"Li/b;", "", "<init>", "()V", "a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "activity_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class b {

    /* compiled from: ActivityResultContracts.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\b\u0016\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Li/b$a;", "Li/a;", "Landroid/net/Uri;", "", "<init>", "()V", "activity_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static class a extends AbstractC41201a<Uri, Boolean> {
        @Override // i.AbstractC41201a
        public final Intent createIntent(Context context, Uri uri) {
            return new Intent("android.media.action.VIDEO_CAPTURE").putExtra("output", uri);
        }

        @Override // i.AbstractC41201a
        public final /* bridge */ /* synthetic */ AbstractC41201a.C11360a<Boolean> getSynchronousResult(Context context, Uri uri) {
            return null;
        }

        @Override // i.AbstractC41201a
        public final Boolean parseResult(int i12, Intent intent) {
            return Boolean.valueOf(i12 == -1);
        }
    }

    /* compiled from: ActivityResultContracts.kt */
    @s0
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0017\u0018\u00002\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0001B\t\b\u0017¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Li/b$b;", "Li/a;", "", "Landroid/net/Uri;", "<init>", "()V", "activity_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    @X
    /* renamed from: i.b$b, reason: collision with other inner class name */
    public static class C11361b extends AbstractC41201a<String, Uri> {

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        public final String f398325b = "*/*";

        @InterfaceC42830m
        public C11361b() {
        }

        @Override // i.AbstractC41201a
        public final Intent createIntent(Context context, String str) {
            return new Intent("android.intent.action.CREATE_DOCUMENT").setType(this.f398325b).putExtra("android.intent.extra.TITLE", str);
        }

        @Override // i.AbstractC41201a
        public final /* bridge */ /* synthetic */ AbstractC41201a.C11360a<Uri> getSynchronousResult(Context context, String str) {
            return null;
        }

        @Override // i.AbstractC41201a
        public final Uri parseResult(int i12, Intent intent) {
            if (i12 != -1) {
                intent = null;
            }
            if (intent != null) {
                return intent.getData();
            }
            return null;
        }
    }

    /* compiled from: ActivityResultContracts.kt */
    @s0
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0016\u0018\u00002\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0001B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Li/b$c;", "Li/a;", "", "Landroid/net/Uri;", "<init>", "()V", "activity_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static class c extends AbstractC41201a<String, Uri> {
        @Override // i.AbstractC41201a
        public final Intent createIntent(Context context, String str) {
            return new Intent("android.intent.action.GET_CONTENT").addCategory("android.intent.category.OPENABLE").setType(str);
        }

        @Override // i.AbstractC41201a
        public final /* bridge */ /* synthetic */ AbstractC41201a.C11360a<Uri> getSynchronousResult(Context context, String str) {
            return null;
        }

        @Override // i.AbstractC41201a
        public final Uri parseResult(int i12, Intent intent) {
            if (i12 != -1) {
                intent = null;
            }
            if (intent != null) {
                return intent.getData();
            }
            return null;
        }
    }

    /* compiled from: ActivityResultContracts.kt */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0017\u0018\u00002\u0019\u0012\u0004\u0012\u00020\u0002\u0012\u000f\u0012\r\u0012\t\u0012\u00070\u0004¢\u0006\u0002\b\u00050\u00030\u0001:\u0001\bB\u0007¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\t"}, d2 = {"Li/b$d;", "Li/a;", "", "", "Landroid/net/Uri;", "LX41/o;", "<init>", "()V", "a", "activity_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    @X
    public static class d extends AbstractC41201a<String, List<Uri>> {

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        public static final a f398326b = new a(null);

        /* compiled from: ActivityResultContracts.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0081\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Li/b$d$a;", "", "<init>", "()V", "activity_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
        @X
        public static final class a {
            public /* synthetic */ a(C42822w c42822w) {
                this();
            }

            @Y61.k
            public static List a(@Y61.k Intent intent) {
                LinkedHashSet linkedHashSet = new LinkedHashSet();
                Uri data = intent.getData();
                if (data != null) {
                    linkedHashSet.add(data);
                }
                ClipData clipData = intent.getClipData();
                if (clipData == null && linkedHashSet.isEmpty()) {
                    return C42784z0.f406748b;
                }
                if (clipData != null) {
                    int itemCount = clipData.getItemCount();
                    for (int i12 = 0; i12 < itemCount; i12++) {
                        Uri uri = clipData.getItemAt(i12).getUri();
                        if (uri != null) {
                            linkedHashSet.add(uri);
                        }
                    }
                }
                return new ArrayList(linkedHashSet);
            }

            public a() {
            }
        }

        @Override // i.AbstractC41201a
        public final Intent createIntent(Context context, String str) {
            return new Intent("android.intent.action.GET_CONTENT").addCategory("android.intent.category.OPENABLE").setType(str).putExtra("android.intent.extra.ALLOW_MULTIPLE", true);
        }

        @Override // i.AbstractC41201a
        public final /* bridge */ /* synthetic */ AbstractC41201a.C11360a<List<Uri>> getSynchronousResult(Context context, String str) {
            return null;
        }

        @Override // i.AbstractC41201a
        public final List<Uri> parseResult(int i12, Intent intent) {
            if (i12 != -1) {
                intent = null;
            }
            if (intent != null) {
                f398326b.getClass();
                List<Uri> listA = a.a(intent);
                if (listA != null) {
                    return listA;
                }
            }
            return C42784z0.f406748b;
        }
    }

    /* compiled from: ActivityResultContracts.kt */
    @s0
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0017\u0018\u00002\u0016\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u0001B\u0007¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Li/b$e;", "Li/a;", "", "", "Landroid/net/Uri;", "<init>", "()V", "activity_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    @X
    public static class e extends AbstractC41201a<String[], Uri> {
        @Override // i.AbstractC41201a
        public final Intent createIntent(Context context, String[] strArr) {
            return new Intent("android.intent.action.OPEN_DOCUMENT").putExtra("android.intent.extra.MIME_TYPES", strArr).setType("*/*");
        }

        @Override // i.AbstractC41201a
        public final /* bridge */ /* synthetic */ AbstractC41201a.C11360a<Uri> getSynchronousResult(Context context, String[] strArr) {
            return null;
        }

        @Override // i.AbstractC41201a
        public final Uri parseResult(int i12, Intent intent) {
            if (i12 != -1) {
                intent = null;
            }
            if (intent != null) {
                return intent.getData();
            }
            return null;
        }
    }

    /* compiled from: ActivityResultContracts.kt */
    @s0
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0017\u0018\u00002\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Li/b$f;", "Li/a;", "Landroid/net/Uri;", "<init>", "()V", "activity_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    @X
    public static class f extends AbstractC41201a<Uri, Uri> {
        @Override // i.AbstractC41201a
        public final Intent createIntent(Context context, Uri uri) {
            Uri uri2 = uri;
            Intent intent = new Intent("android.intent.action.OPEN_DOCUMENT_TREE");
            if (uri2 != null) {
                intent.putExtra("android.provider.extra.INITIAL_URI", uri2);
            }
            return intent;
        }

        @Override // i.AbstractC41201a
        public final /* bridge */ /* synthetic */ AbstractC41201a.C11360a<Uri> getSynchronousResult(Context context, Uri uri) {
            return null;
        }

        @Override // i.AbstractC41201a
        public final Uri parseResult(int i12, Intent intent) {
            if (i12 != -1) {
                intent = null;
            }
            if (intent != null) {
                return intent.getData();
            }
            return null;
        }
    }

    /* compiled from: ActivityResultContracts.kt */
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0017\u0018\u00002\u001f\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u000f\u0012\r\u0012\t\u0012\u00070\u0005¢\u0006\u0002\b\u00060\u00040\u0001B\u0007¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Li/b$g;", "Li/a;", "", "", "", "Landroid/net/Uri;", "LX41/o;", "<init>", "()V", "activity_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    @X
    public static class g extends AbstractC41201a<String[], List<Uri>> {
        @Override // i.AbstractC41201a
        public final Intent createIntent(Context context, String[] strArr) {
            return new Intent("android.intent.action.OPEN_DOCUMENT").putExtra("android.intent.extra.MIME_TYPES", strArr).putExtra("android.intent.extra.ALLOW_MULTIPLE", true).setType("*/*");
        }

        @Override // i.AbstractC41201a
        public final /* bridge */ /* synthetic */ AbstractC41201a.C11360a<List<Uri>> getSynchronousResult(Context context, String[] strArr) {
            return null;
        }

        @Override // i.AbstractC41201a
        public final List<Uri> parseResult(int i12, Intent intent) {
            if (i12 != -1) {
                intent = null;
            }
            if (intent != null) {
                d.f398326b.getClass();
                List<Uri> listA = d.a.a(intent);
                if (listA != null) {
                    return listA;
                }
            }
            return C42784z0.f406748b;
        }
    }

    /* compiled from: ActivityResultContracts.kt */
    @s0
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0001B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Li/b$h;", "Li/a;", "Ljava/lang/Void;", "Landroid/net/Uri;", "<init>", "()V", "activity_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class h extends AbstractC41201a<Void, Uri> {
        @Override // i.AbstractC41201a
        public final Intent createIntent(Context context, Void r22) {
            return new Intent("android.intent.action.PICK").setType("vnd.android.cursor.dir/contact");
        }

        @Override // i.AbstractC41201a
        public final Uri parseResult(int i12, Intent intent) {
            if (i12 != -1) {
                intent = null;
            }
            if (intent != null) {
                return intent.getData();
            }
            return null;
        }
    }

    /* compiled from: ActivityResultContracts.kt */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0017\u0018\u00002\u0019\u0012\u0004\u0012\u00020\u0002\u0012\u000f\u0012\r\u0012\t\u0012\u00070\u0004¢\u0006\u0002\b\u00050\u00030\u0001:\u0001\u0006¨\u0006\u0007"}, d2 = {"Li/b$i;", "Li/a;", "Landroidx/activity/result/l;", "", "Landroid/net/Uri;", "LX41/o;", "a", "activity_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    @X
    public static class i extends AbstractC41201a<androidx.view.result.l, List<Uri>> {

        /* renamed from: c, reason: collision with root package name */
        @Y61.k
        public static final a f398327c = new a(null);

        /* renamed from: b, reason: collision with root package name */
        public final int f398328b;

        /* compiled from: ActivityResultContracts.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0080\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Li/b$i$a;", "", "<init>", "()V", "activity_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class a {
            public /* synthetic */ a(C42822w c42822w) {
                this();
            }

            public a() {
            }
        }

        public i() {
            this(0, 1, null);
        }

        @Override // i.AbstractC41201a
        @InterfaceC42153i
        @Y61.k
        @SuppressLint({"NewApi", "ClassVerificationFailure"})
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Intent createIntent(@Y61.k Context context, @Y61.k androidx.view.result.l lVar) {
            j.f398329b.getClass();
            boolean zB2 = j.a.b();
            int i12 = this.f398328b;
            if (zB2) {
                Intent intent = new Intent("android.provider.action.PICK_IMAGES");
                intent.setType(j.a.a(lVar.f21273a));
                if (i12 > MediaStore.getPickImagesMaxLimit()) {
                    throw new IllegalArgumentException("Max items must be less or equals MediaStore.getPickImagesMaxLimit()");
                }
                intent.putExtra("android.provider.extra.PICK_IMAGES_MAX", i12);
                return intent;
            }
            if (context.getPackageManager().resolveActivity(new Intent("androidx.activity.result.contract.action.PICK_IMAGES"), 1114112) != null) {
                ResolveInfo resolveInfoResolveActivity = context.getPackageManager().resolveActivity(new Intent("androidx.activity.result.contract.action.PICK_IMAGES"), 1114112);
                if (resolveInfoResolveActivity == null) {
                    throw new IllegalStateException("Required value was null.");
                }
                ActivityInfo activityInfo = resolveInfoResolveActivity.activityInfo;
                Intent intent2 = new Intent("androidx.activity.result.contract.action.PICK_IMAGES");
                intent2.setClassName(activityInfo.applicationInfo.packageName, activityInfo.name);
                intent2.setType(j.a.a(lVar.f21273a));
                intent2.putExtra("com.google.android.gms.provider.extra.PICK_IMAGES_MAX", i12);
                return intent2;
            }
            if (context.getPackageManager().resolveActivity(new Intent("com.google.android.gms.provider.action.PICK_IMAGES"), 1114112) != null) {
                ResolveInfo resolveInfoResolveActivity2 = context.getPackageManager().resolveActivity(new Intent("com.google.android.gms.provider.action.PICK_IMAGES"), 1114112);
                if (resolveInfoResolveActivity2 == null) {
                    throw new IllegalStateException("Required value was null.");
                }
                ActivityInfo activityInfo2 = resolveInfoResolveActivity2.activityInfo;
                Intent intent3 = new Intent("com.google.android.gms.provider.action.PICK_IMAGES");
                intent3.setClassName(activityInfo2.applicationInfo.packageName, activityInfo2.name);
                intent3.putExtra("com.google.android.gms.provider.extra.PICK_IMAGES_MAX", i12);
                return intent3;
            }
            Intent intent4 = new Intent("android.intent.action.OPEN_DOCUMENT");
            intent4.setType(j.a.a(lVar.f21273a));
            intent4.putExtra("android.intent.extra.ALLOW_MULTIPLE", true);
            if (intent4.getType() != null) {
                return intent4;
            }
            intent4.setType("*/*");
            intent4.putExtra("android.intent.extra.MIME_TYPES", new String[]{"image/*", "video/*"});
            return intent4;
        }

        @Override // i.AbstractC41201a
        public final /* bridge */ /* synthetic */ AbstractC41201a.C11360a<List<Uri>> getSynchronousResult(Context context, androidx.view.result.l lVar) {
            return null;
        }

        @Override // i.AbstractC41201a
        public final List<Uri> parseResult(int i12, Intent intent) {
            if (i12 != -1) {
                intent = null;
            }
            if (intent != null) {
                d.f398326b.getClass();
                List<Uri> listA = d.a.a(intent);
                if (listA != null) {
                    return listA;
                }
            }
            return C42784z0.f406748b;
        }

        public i(int i12, int i13, C42822w c42822w) {
            if ((i13 & 1) != 0) {
                f398327c.getClass();
                j.f398329b.getClass();
                i12 = j.a.b() ? MediaStore.getPickImagesMaxLimit() : Integer.MAX_VALUE;
            }
            this.f398328b = i12;
            if (i12 <= 1) {
                throw new IllegalArgumentException("Max items must be higher than 1");
            }
        }
    }

    /* compiled from: ActivityResultContracts.kt */
    @s0
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0017\u0018\u00002\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0001:\u0006\u0006\u0007\b\t\n\u000bB\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\f"}, d2 = {"Li/b$j;", "Li/a;", "Landroidx/activity/result/l;", "Landroid/net/Uri;", "<init>", "()V", "a", "b", "c", "d", "e", "f", "activity_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    @X
    public static class j extends AbstractC41201a<androidx.view.result.l, Uri> {

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        public static final a f398329b = new a(null);

        /* compiled from: ActivityResultContracts.kt */
        @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006¨\u0006\b"}, d2 = {"Li/b$j$a;", "", "<init>", "()V", "", "GMS_ACTION_PICK_IMAGES", "Ljava/lang/String;", "GMS_EXTRA_PICK_IMAGES_MAX", "activity_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class a {
            public /* synthetic */ a(C42822w c42822w) {
                this();
            }

            @Y61.l
            public static String a(@Y61.k f fVar) {
                if (fVar instanceof c) {
                    return "image/*";
                }
                if (fVar instanceof e) {
                    return "video/*";
                }
                if ((fVar instanceof d) || (fVar instanceof C11362b)) {
                    return null;
                }
                throw new NoWhenBranchMatchedException();
            }

            @X41.n
            @SuppressLint({"ClassVerificationFailure", "NewApi"})
            public static boolean b() {
                int i12 = Build.VERSION.SDK_INT;
                if (i12 >= 33) {
                    return true;
                }
                return i12 >= 30 && SdkExtensions.getExtensionVersion(30) >= 2;
            }

            public a() {
            }
        }

        /* compiled from: ActivityResultContracts.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Li/b$j$b;", "Li/b$j$f;", "<init>", "()V", "activity_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
        /* renamed from: i.b$j$b, reason: collision with other inner class name */
        public static final class C11362b implements f {

            /* renamed from: a, reason: collision with root package name */
            @Y61.k
            public static final C11362b f398330a = new C11362b();
        }

        /* compiled from: ActivityResultContracts.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Li/b$j$c;", "Li/b$j$f;", "<init>", "()V", "activity_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class c implements f {

            /* renamed from: a, reason: collision with root package name */
            @Y61.k
            public static final c f398331a = new c();
        }

        /* compiled from: ActivityResultContracts.kt */
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Li/b$j$d;", "Li/b$j$f;", "activity_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class d implements f {
        }

        /* compiled from: ActivityResultContracts.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Li/b$j$e;", "Li/b$j$f;", "<init>", "()V", "activity_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class e implements f {
            static {
                new e();
            }
        }

        /* compiled from: ActivityResultContracts.kt */
        @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001\u0082\u0001\u0004\u0002\u0003\u0004\u0005ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0006À\u0006\u0001"}, d2 = {"Li/b$j$f;", "", "Li/b$j$b;", "Li/b$j$c;", "Li/b$j$d;", "Li/b$j$e;", "activity_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public interface f {
        }

        @Override // i.AbstractC41201a
        public final Intent createIntent(Context context, androidx.view.result.l lVar) {
            Intent intent;
            androidx.view.result.l lVar2 = lVar;
            f398329b.getClass();
            if (a.b()) {
                Intent intent2 = new Intent("android.provider.action.PICK_IMAGES");
                intent2.setType(a.a(lVar2.f21273a));
                return intent2;
            }
            if (context.getPackageManager().resolveActivity(new Intent("androidx.activity.result.contract.action.PICK_IMAGES"), 1114112) != null) {
                ResolveInfo resolveInfoResolveActivity = context.getPackageManager().resolveActivity(new Intent("androidx.activity.result.contract.action.PICK_IMAGES"), 1114112);
                if (resolveInfoResolveActivity == null) {
                    throw new IllegalStateException("Required value was null.");
                }
                ActivityInfo activityInfo = resolveInfoResolveActivity.activityInfo;
                intent = new Intent("androidx.activity.result.contract.action.PICK_IMAGES");
                intent.setClassName(activityInfo.applicationInfo.packageName, activityInfo.name);
                intent.setType(a.a(lVar2.f21273a));
            } else {
                if (context.getPackageManager().resolveActivity(new Intent("com.google.android.gms.provider.action.PICK_IMAGES"), 1114112) == null) {
                    Intent intent3 = new Intent("android.intent.action.OPEN_DOCUMENT");
                    intent3.setType(a.a(lVar2.f21273a));
                    if (intent3.getType() != null) {
                        return intent3;
                    }
                    intent3.setType("*/*");
                    intent3.putExtra("android.intent.extra.MIME_TYPES", new String[]{"image/*", "video/*"});
                    return intent3;
                }
                ResolveInfo resolveInfoResolveActivity2 = context.getPackageManager().resolveActivity(new Intent("com.google.android.gms.provider.action.PICK_IMAGES"), 1114112);
                if (resolveInfoResolveActivity2 == null) {
                    throw new IllegalStateException("Required value was null.");
                }
                ActivityInfo activityInfo2 = resolveInfoResolveActivity2.activityInfo;
                intent = new Intent("com.google.android.gms.provider.action.PICK_IMAGES");
                intent.setClassName(activityInfo2.applicationInfo.packageName, activityInfo2.name);
                intent.setType(a.a(lVar2.f21273a));
            }
            return intent;
        }

        @Override // i.AbstractC41201a
        public final /* bridge */ /* synthetic */ AbstractC41201a.C11360a<Uri> getSynchronousResult(Context context, androidx.view.result.l lVar) {
            return null;
        }

        @Override // i.AbstractC41201a
        public final Uri parseResult(int i12, Intent intent) {
            if (i12 != -1) {
                intent = null;
            }
            if (intent == null) {
                return null;
            }
            Uri data = intent.getData();
            if (data == null) {
                d.f398326b.getClass();
                data = (Uri) C42745f0.G(d.a.a(intent));
            }
            return data;
        }
    }

    /* compiled from: ActivityResultContracts.kt */
    @s0
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0002\u0010$\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002%\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0015\u0012\u0013\u0012\u0004\u0012\u00020\u0003\u0012\t\u0012\u00070\u0005¢\u0006\u0002\b\u00060\u00040\u0001:\u0001\tB\u0007¢\u0006\u0004\b\u0007\u0010\b¨\u0006\n"}, d2 = {"Li/b$k;", "Li/a;", "", "", "", "", "LX41/o;", "<init>", "()V", "a", "activity_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class k extends AbstractC41201a<String[], Map<String, Boolean>> {

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        public static final a f398332b = new a(null);

        /* compiled from: ActivityResultContracts.kt */
        @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\b\u0010\u0006¨\u0006\t"}, d2 = {"Li/b$k$a;", "", "<init>", "()V", "", "ACTION_REQUEST_PERMISSIONS", "Ljava/lang/String;", "EXTRA_PERMISSIONS", "EXTRA_PERMISSION_GRANT_RESULTS", "activity_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class a {
            public /* synthetic */ a(C42822w c42822w) {
                this();
            }

            public a() {
            }
        }

        @Override // i.AbstractC41201a
        public final Intent createIntent(Context context, String[] strArr) {
            f398332b.getClass();
            return new Intent("androidx.activity.result.contract.action.REQUEST_PERMISSIONS").putExtra("androidx.activity.result.contract.extra.PERMISSIONS", strArr);
        }

        @Override // i.AbstractC41201a
        public final AbstractC41201a.C11360a<Map<String, Boolean>> getSynchronousResult(Context context, String[] strArr) {
            String[] strArr2 = strArr;
            if (strArr2.length == 0) {
                return new AbstractC41201a.C11360a<>((Serializable) P0.c());
            }
            for (String str : strArr2) {
                if (androidx.core.content.d.checkSelfPermission(context, str) != 0) {
                    return null;
                }
            }
            int iF2 = P0.f(strArr2.length);
            if (iF2 < 16) {
                iF2 = 16;
            }
            LinkedHashMap linkedHashMap = new LinkedHashMap(iF2);
            for (String str2 : strArr2) {
                linkedHashMap.put(str2, Boolean.TRUE);
            }
            return new AbstractC41201a.C11360a<>(linkedHashMap);
        }

        @Override // i.AbstractC41201a
        public final Map<String, Boolean> parseResult(int i12, Intent intent) {
            if (i12 != -1) {
                return P0.c();
            }
            if (intent == null) {
                return P0.c();
            }
            String[] stringArrayExtra = intent.getStringArrayExtra("androidx.activity.result.contract.extra.PERMISSIONS");
            int[] intArrayExtra = intent.getIntArrayExtra("androidx.activity.result.contract.extra.PERMISSION_GRANT_RESULTS");
            if (intArrayExtra == null || stringArrayExtra == null) {
                return P0.c();
            }
            ArrayList arrayList = new ArrayList(intArrayExtra.length);
            for (int i13 : intArrayExtra) {
                arrayList.add(Boolean.valueOf(i13 == 0));
            }
            return P0.p(C42745f0.T0(C42756l.B(stringArrayExtra), arrayList));
        }
    }

    /* compiled from: ActivityResultContracts.kt */
    @s0
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010\u000b\n\u0002\b\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Li/b$l;", "Li/a;", "", "", "<init>", "()V", "activity_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class l extends AbstractC41201a<String, Boolean> {
        @Override // i.AbstractC41201a
        public final Intent createIntent(Context context, String str) {
            k.f398332b.getClass();
            return new Intent("androidx.activity.result.contract.action.REQUEST_PERMISSIONS").putExtra("androidx.activity.result.contract.extra.PERMISSIONS", new String[]{str});
        }

        @Override // i.AbstractC41201a
        public final AbstractC41201a.C11360a<Boolean> getSynchronousResult(Context context, String str) {
            if (androidx.core.content.d.checkSelfPermission(context, str) == 0) {
                return new AbstractC41201a.C11360a<>(Boolean.TRUE);
            }
            return null;
        }

        @Override // i.AbstractC41201a
        public final Boolean parseResult(int i12, Intent intent) {
            if (intent == null || i12 != -1) {
                return Boolean.FALSE;
            }
            int[] intArrayExtra = intent.getIntArrayExtra("androidx.activity.result.contract.extra.PERMISSION_GRANT_RESULTS");
            boolean z12 = false;
            if (intArrayExtra != null) {
                int length = intArrayExtra.length;
                int i13 = 0;
                while (true) {
                    if (i13 >= length) {
                        break;
                    }
                    if (intArrayExtra[i13] == 0) {
                        z12 = true;
                        break;
                    }
                    i13++;
                }
            }
            return Boolean.valueOf(z12);
        }
    }

    /* compiled from: ActivityResultContracts.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u0006B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0007"}, d2 = {"Li/b$m;", "Li/a;", "Landroid/content/Intent;", "Landroidx/activity/result/ActivityResult;", "<init>", "()V", "a", "activity_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class m extends AbstractC41201a<Intent, ActivityResult> {

        /* compiled from: ActivityResultContracts.kt */
        @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Li/b$m$a;", "", "<init>", "()V", "", "EXTRA_ACTIVITY_OPTIONS_BUNDLE", "Ljava/lang/String;", "activity_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
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

        @Override // i.AbstractC41201a
        public final Intent createIntent(Context context, Intent intent) {
            return intent;
        }

        @Override // i.AbstractC41201a
        public final ActivityResult parseResult(int i12, Intent intent) {
            return new ActivityResult(i12, intent);
        }
    }

    /* compiled from: ActivityResultContracts.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u0006B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0007"}, d2 = {"Li/b$n;", "Li/a;", "Landroidx/activity/result/IntentSenderRequest;", "Landroidx/activity/result/ActivityResult;", "<init>", "()V", "a", "activity_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class n extends AbstractC41201a<IntentSenderRequest, ActivityResult> {

        /* compiled from: ActivityResultContracts.kt */
        @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\b\u0010\u0006¨\u0006\t"}, d2 = {"Li/b$n$a;", "", "<init>", "()V", "", "ACTION_INTENT_SENDER_REQUEST", "Ljava/lang/String;", "EXTRA_INTENT_SENDER_REQUEST", "EXTRA_SEND_INTENT_EXCEPTION", "activity_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
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

        @Override // i.AbstractC41201a
        public final Intent createIntent(Context context, IntentSenderRequest intentSenderRequest) {
            return new Intent("androidx.activity.result.contract.action.INTENT_SENDER_REQUEST").putExtra("androidx.activity.result.contract.extra.INTENT_SENDER_REQUEST", intentSenderRequest);
        }

        @Override // i.AbstractC41201a
        public final ActivityResult parseResult(int i12, Intent intent) {
            return new ActivityResult(i12, intent);
        }
    }

    /* compiled from: ActivityResultContracts.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\b\u0016\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Li/b$o;", "Li/a;", "Landroid/net/Uri;", "", "<init>", "()V", "activity_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static class o extends AbstractC41201a<Uri, Boolean> {
        @Override // i.AbstractC41201a
        public final Intent createIntent(Context context, Uri uri) {
            return new Intent("android.media.action.IMAGE_CAPTURE").putExtra("output", uri);
        }

        @Override // i.AbstractC41201a
        public final /* bridge */ /* synthetic */ AbstractC41201a.C11360a<Boolean> getSynchronousResult(Context context, Uri uri) {
            return null;
        }

        @Override // i.AbstractC41201a
        public final Boolean parseResult(int i12, Intent intent) {
            return Boolean.valueOf(i12 == -1);
        }
    }

    /* compiled from: ActivityResultContracts.kt */
    @s0
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0016\u0018\u00002\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0001B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Li/b$p;", "Li/a;", "Ljava/lang/Void;", "Landroid/graphics/Bitmap;", "<init>", "()V", "activity_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static class p extends AbstractC41201a<Void, Bitmap> {
        @Override // i.AbstractC41201a
        public final Intent createIntent(Context context, Void r22) {
            return new Intent("android.media.action.IMAGE_CAPTURE");
        }

        @Override // i.AbstractC41201a
        public final /* bridge */ /* synthetic */ AbstractC41201a.C11360a<Bitmap> getSynchronousResult(Context context, Void r22) {
            return null;
        }

        @Override // i.AbstractC41201a
        public final Bitmap parseResult(int i12, Intent intent) {
            if (i12 != -1) {
                intent = null;
            }
            if (intent != null) {
                return (Bitmap) intent.getParcelableExtra("data");
            }
            return null;
        }
    }

    /* compiled from: ActivityResultContracts.kt */
    @s0
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0017\u0018\u00002\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0001B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Li/b$q;", "Li/a;", "Landroid/net/Uri;", "Landroid/graphics/Bitmap;", "<init>", "()V", "activity_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    @InterfaceC42830m
    public static class q extends AbstractC41201a<Uri, Bitmap> {
        @Override // i.AbstractC41201a
        public final Intent createIntent(Context context, Uri uri) {
            return new Intent("android.media.action.VIDEO_CAPTURE").putExtra("output", uri);
        }

        @Override // i.AbstractC41201a
        public final /* bridge */ /* synthetic */ AbstractC41201a.C11360a<Bitmap> getSynchronousResult(Context context, Uri uri) {
            return null;
        }

        @Override // i.AbstractC41201a
        public final Bitmap parseResult(int i12, Intent intent) {
            if (i12 != -1) {
                intent = null;
            }
            if (intent != null) {
                return (Bitmap) intent.getParcelableExtra("data");
            }
            return null;
        }
    }
}
