package ru.cyberity.cbr.camera;

import Y41.p;
import Y61.k;
import Y61.l;
import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.DialogInterface;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import androidx.view.result.h;
import com.avito.android.remote.model.messenger.voice.VoiceInfo;
import com.avito.android.remote.model.text.TooltipAttribute;
import i.b;
import java.util.Map;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.N;
import pY0.C47034b;
import ru.cyberity.cbr.camera.b;
import ru.cyberity.cbr.camera.c;
import ru.cyberity.cbr.camera.d;
import ru.cyberity.cbr.core.android.PickerLifecycleObserver;
import ru.cyberity.cbr.core.common.j0;
import ru.cyberity.cbr.core.common.n0;
import ru.cyberity.cbr.core.common.r;
import ru.cyberity.cbr.core.common.s;
import ru.cyberity.cbr.core.common.t;
import ru.cyberity.cbr.core.common.v;
import ru.cyberity.cbr.core.data.listener.CBRIconHandler;
import ru.cyberity.cbr.core.presentation.helper.ThemeHelper;
import ru.cyberity.cbr.core.theme.CBRColorElement;
import ru.cyberity.cbr.core.widget.CBRAlertDialogBuilder;
import ru.cyberity.internal.R;

/* compiled from: CBRCameraPhotoFragment.kt */
@Metadata(d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\b\u000e\b&\u0018\u0000 5*\b\b\u0000\u0010\u0002*\u00020\u00012\b\u0012\u0004\u0012\u00028\u00000\u0003:\u0001\u000bB\u0007¢\u0006\u0004\b\u0004\u0010\u0005J#\u0010\u000b\u001a\u00020\n2\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006H\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0019\u0010\u000b\u001a\u00020\n2\b\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0002¢\u0006\u0004\b\u000b\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\nH\u0002¢\u0006\u0004\b\u0010\u0010\u0005J\u000f\u0010\u0011\u001a\u00020\nH\u0003¢\u0006\u0004\b\u0011\u0010\u0005J!\u0010\u0016\u001a\u00020\n2\u0006\u0010\u0013\u001a\u00020\u00122\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0018\u001a\u00020\nH\u0016¢\u0006\u0004\b\u0018\u0010\u0005J\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\u001a\u001a\u00020\u0019H\u0014¢\u0006\u0004\b\u000b\u0010\u001bJ\u0017\u0010\u001d\u001a\u00020\n2\u0006\u0010\u001c\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u001d\u0010\u001eR\u0018\u0010\"\u001a\u0004\u0018\u00010\u001f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b \u0010!R\u0018\u0010&\u001a\u0004\u0018\u00010#8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b$\u0010%R$\u0010+\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070(\u0018\u00010'8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b)\u0010*R\u0014\u0010.\u001a\u00020\u00078BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b,\u0010-R\u0014\u00101\u001a\u00020\b8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b/\u00100R\u0016\u00104\u001a\u0004\u0018\u00010\u00128$X¤\u0004¢\u0006\u0006\u001a\u0004\b2\u00103¨\u00066"}, d2 = {"Lru/cyberity/cbr/camera/b;", "Lru/cyberity/cbr/camera/c;", "VM", "Lru/cyberity/cbr/camera/a;", "<init>", "()V", "", "", "", "grantResults", "Lkotlin/G0;", "a", "(Ljava/util/Map;)V", "Landroid/net/Uri;", TooltipAttribute.PARAM_DEEP_LINK, "(Landroid/net/Uri;)V", "A", "B", "Landroid/view/View;", "view", "Landroid/os/Bundle;", "savedInstanceState", "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "onDestroy", "Lru/cyberity/cbr/camera/d$b;", VoiceInfo.STATE, "(Lru/cyberity/cbr/camera/d$b;)V", "outState", "onSaveInstanceState", "(Landroid/os/Bundle;)V", "Lru/cyberity/cbr/core/android/PickerLifecycleObserver;", "m", "Lru/cyberity/cbr/core/android/PickerLifecycleObserver;", "pickerLifecycleObserver", "Landroidx/appcompat/app/l;", "n", "Landroidx/appcompat/app/l;", "lackOfPermissionsDialog", "Landroidx/activity/result/h;", "", "o", "Landroidx/activity/result/h;", "permissionLauncher", "y", "()Ljava/lang/String;", "pickerMimeType", "x", "()Z", "hasGallery", "z", "()Landroid/view/View;", "takeGalleryView", "p", "cyberity-mobile-sdk-internal_release"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes9.dex */
public abstract class b<VM extends ru.cyberity.cbr.camera.c> extends a<VM> {

    /* renamed from: m, reason: collision with root package name and from kotlin metadata */
    @l
    private PickerLifecycleObserver pickerLifecycleObserver;

    /* renamed from: n, reason: collision with root package name and from kotlin metadata */
    @l
    private androidx.appcompat.app.l lackOfPermissionsDialog;

    /* renamed from: o, reason: collision with root package name and from kotlin metadata */
    @l
    private h<String[]> permissionLauncher;

    /* compiled from: CBRCameraPhotoFragment.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\b\b\u0000\u0010\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lru/cyberity/cbr/camera/c;", "VM", "Lkotlin/G0;", "a", "()V"}, k = 3, mv = {1, 7, 1})
    /* renamed from: ru.cyberity.cbr.camera.b$b, reason: collision with other inner class name */
    public static final class C12415b extends N implements Y41.a<G0> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ b<VM> f431997a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C12415b(b<VM> bVar) {
            super(0);
            this.f431997a = bVar;
        }

        public final void a() {
            this.f431997a.B();
        }

        @Override // Y41.a
        public /* bridge */ /* synthetic */ G0 invoke() {
            a();
            return G0.f406611a;
        }
    }

    /* compiled from: CBRCameraPhotoFragment.kt */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\u00020\u0006\"\b\b\u0000\u0010\u0001*\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lru/cyberity/cbr/camera/c;", "VM", "", "id", "Landroid/net/Uri;", TooltipAttribute.PARAM_DEEP_LINK, "Lkotlin/G0;", "a", "(Ljava/lang/String;Landroid/net/Uri;)V"}, k = 3, mv = {1, 7, 1})
    public static final class c extends N implements p<String, Uri, G0> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ b<VM> f431998a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(b<VM> bVar) {
            super(2);
            this.f431998a = bVar;
        }

        public final void a(@k String str, @l Uri uri) {
            this.f431998a.a(uri);
        }

        @Override // Y41.p
        public /* bridge */ /* synthetic */ G0 invoke(String str, Uri uri) {
            a(str, uri);
            return G0.f406611a;
        }
    }

    /* compiled from: CBRCameraPhotoFragment.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004\"\b\b\u0000\u0010\u0001*\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u008a@¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lru/cyberity/cbr/camera/c;", "VM", "Lru/cyberity/cbr/camera/c$a;", "it", "Lkotlin/G0;", "<anonymous>", "(Lru/cyberity/cbr/camera/c$a;)V"}, k = 3, mv = {1, 7, 1})
    @DebugMetadata(c = "ru.cyberity.cbr.camera.CBRCameraPhotoFragment$onViewCreated$4", f = "CBRCameraPhotoFragment.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class d extends SuspendLambda implements p<c.a, Continuation<? super G0>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f431999a;

        /* renamed from: b, reason: collision with root package name */
        /* synthetic */ Object f432000b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ b<VM> f432001c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(b<VM> bVar, Continuation<? super d> continuation) {
            super(2, continuation);
            this.f432001c = bVar;
        }

        @Override // Y41.p
        @l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(@k c.a aVar, @l Continuation<? super G0> continuation) {
            return ((d) create(aVar, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @k
        public final Continuation<G0> create(@l Object obj, @k Continuation<?> continuation) {
            d dVar = new d(this.f432001c, continuation);
            dVar.f432000b = obj;
            return dVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @l
        public final Object invokeSuspend(@k Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.f431999a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C42729a0.b(obj);
            c.a aVar = (c.a) this.f432000b;
            b<VM> bVar = this.f432001c;
            C47034b positiveButton = new CBRAlertDialogBuilder(this.f432001c.requireContext()).setMessage(aVar.getPermissionsTitle()).setPositiveButton(aVar.getPermissionsPositive(), (DialogInterface.OnClickListener) null);
            CharSequence charSequenceD = aVar.getPermissionNegative();
            final b<VM> bVar2 = this.f432001c;
            ((b) bVar).lackOfPermissionsDialog = positiveButton.setNeutralButton(charSequenceD, new DialogInterface.OnClickListener() { // from class: ru.cyberity.cbr.camera.g
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i12) {
                    b.d.a(bVar2, dialogInterface, i12);
                }
            }).create();
            return G0.f406611a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void a(b bVar, DialogInterface dialogInterface, int i12) {
            s.a((Activity) bVar.requireActivity());
        }
    }

    private final void A() {
        PickerLifecycleObserver pickerLifecycleObserver = this.pickerLifecycleObserver;
        if (pickerLifecycleObserver == null || pickerLifecycleObserver.a(String.valueOf(System.currentTimeMillis()))) {
            return;
        }
        getViewModel().k();
    }

    /* JADX INFO: Access modifiers changed from: private */
    @SuppressLint({"ObsoleteSdkInt"})
    public final void B() {
        if (Build.VERSION.SDK_INT > 28 || t.a(requireContext(), "android.permission.READ_EXTERNAL_STORAGE")) {
            A();
            return;
        }
        h<String[]> hVar = this.permissionLauncher;
        if (hVar != null) {
            hVar.b(new String[]{"android.permission.READ_EXTERNAL_STORAGE"});
        }
    }

    private final boolean x() {
        Bundle arguments = getArguments();
        if (arguments != null) {
            return arguments.getBoolean("EXTRA_GALLERY_AVAILABLE", false);
        }
        return false;
    }

    private final String y() {
        return getResources().getString(R.string.cbr_gallery_type);
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroy() {
        super.onDestroy();
        androidx.appcompat.app.l lVar = this.lackOfPermissionsDialog;
        if (lVar != null) {
            lVar.dismiss();
        }
        this.lackOfPermissionsDialog = null;
    }

    @Override // ru.cyberity.cbr.core.presentation.BaseFragment, androidx.fragment.app.Fragment
    public void onSaveInstanceState(@k Bundle outState) {
        String strB;
        PickerLifecycleObserver pickerLifecycleObserver = this.pickerLifecycleObserver;
        if (pickerLifecycleObserver != null && (strB = pickerLifecycleObserver.getRequestId()) != null) {
            outState.putString("last_picker_request_id", strB);
        }
        super.onSaveInstanceState(outState);
    }

    @Override // ru.cyberity.cbr.camera.a, ru.cyberity.cbr.core.presentation.BaseFragment, androidx.fragment.app.Fragment
    public void onViewCreated(@k View view, @l Bundle savedInstanceState) {
        String string;
        G0 g02;
        Integer color;
        super.onViewCreated(view, savedInstanceState);
        View viewZ = z();
        if (viewZ != null) {
            viewZ.setVisibility(x() ? 0 : 8);
            Drawable drawableOnResolveIcon = n0.f432787a.getIconHandler().onResolveIcon(requireContext(), CBRIconHandler.CBRCommonIcons.GALLERY.getImageName());
            ThemeHelper themeHelper = ThemeHelper.INSTANCE;
            CBRColorElement cBRColorElement = CBRColorElement.CAMERA_CONTENT;
            ru.cyberity.cbr.core.theme.d customTheme = themeHelper.getCustomTheme();
            if (customTheme == null || (color = themeHelper.getColor(customTheme, cBRColorElement, themeHelper.isDarkTheme(viewZ))) == null) {
                g02 = null;
            } else {
                int iIntValue = color.intValue();
                if (drawableOnResolveIcon != null) {
                    drawableOnResolveIcon.setColorFilter(new PorterDuffColorFilter(iIntValue, PorterDuff.Mode.SRC_IN));
                }
                g02 = G0.f406611a;
            }
            if (g02 == null) {
                int color2 = androidx.core.content.d.getColor(viewZ.getContext(), R.color.cbr_camera_content);
                if (drawableOnResolveIcon != null) {
                    drawableOnResolveIcon.setColorFilter(new PorterDuffColorFilter(color2, PorterDuff.Mode.SRC_IN));
                }
            }
            ImageView imageView = viewZ instanceof ImageView ? (ImageView) viewZ : null;
            if (imageView != null) {
                imageView.setImageDrawable(drawableOnResolveIcon);
            }
            v.a(viewZ, new C12415b(this));
        }
        PickerLifecycleObserver pickerLifecycleObserver = new PickerLifecycleObserver(requireActivity().getActivityResultRegistry(), null, r.a(y()), new c(this), null, 18, null);
        if (savedInstanceState != null && (string = savedInstanceState.getString("last_picker_request_id")) != null) {
            pickerLifecycleObserver.c(string);
        }
        getLifecycle().a(pickerLifecycleObserver);
        this.pickerLifecycleObserver = pickerLifecycleObserver;
        j0.b(getViewModel().j(), this, new d(this, null));
        this.permissionLauncher = registerForActivityResult(new b.k(), new e(this, 1));
    }

    @l
    public abstract View z();

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(b bVar, Map map) {
        bVar.a((Map<String, Boolean>) map);
    }

    private final void a(Map<String, Boolean> grantResults) {
        androidx.appcompat.app.l lVar;
        if (L.f(grantResults.get("android.permission.READ_EXTERNAL_STORAGE"), Boolean.TRUE)) {
            A();
        } else {
            if (!L.f(grantResults.get("android.permission.READ_EXTERNAL_STORAGE"), Boolean.FALSE) || (lVar = this.lackOfPermissionsDialog) == null) {
                return;
            }
            lVar.show();
        }
    }

    @Override // ru.cyberity.cbr.camera.a
    public void a(@k d.b state) {
        View viewZ = z();
        if (viewZ == null) {
            return;
        }
        viewZ.setVisibility((state.getShowCamera() && x()) ? 0 : 8);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void a(Uri uri) {
        if (uri == null) {
            return;
        }
        try {
            getViewModel().a(requireContext().getApplicationContext(), y(), uri);
        } catch (Exception e12) {
            ru.cyberity.log.a aVar = ru.cyberity.log.a.f436064a;
            String strA = ru.cyberity.log.c.a(this);
            String message = e12.getMessage();
            if (message == null) {
                message = "";
            }
            aVar.e(strA, message, e12);
        }
    }
}
