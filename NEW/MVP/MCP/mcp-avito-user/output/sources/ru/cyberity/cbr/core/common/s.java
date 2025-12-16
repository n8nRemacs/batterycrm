package ru.cyberity.cbr.core.common;

import android.R;
import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.net.Uri;
import android.os.Build;
import android.os.LocaleList;
import android.text.Layout;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.style.AlignmentSpan;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.InputMethodManager;
import android.widget.TextView;
import androidx.compose.foundation.H;
import androidx.core.view.U;
import androidx.fragment.app.ActivityC22955m;
import com.avito.android.beduin.common.component.input.BeduinInputModel;
import com.avito.android.remote.model.messenger.context.ChannelContext;
import com.avito.android.remote.model.text.TooltipAttribute;
import com.huawei.hms.adapter.internal.AvailableCode;
import io.noties.markwon.AbstractC41740a;
import io.noties.markwon.core.q;
import io.noties.markwon.e;
import io.noties.markwon.g;
import io.noties.markwon.j;
import j.InterfaceC42150f;
import java.io.Closeable;
import java.io.File;
import java.io.IOException;
import java.net.URLConnection;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Base64;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.Q;
import kotlin.collections.P0;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.N;
import kotlin.text.C43044a;
import kotlin.text.C43059p;
import kotlin.text.C43066x;
import kotlin.text.InterfaceC43057n;
import kotlin.text.RegexOption;
import kotlinx.coroutines.C43259k;
import kotlinx.coroutines.C43262l0;
import kotlinx.coroutines.T;
import ru.cyberity.cbr.core.data.model.Document;

/* compiled from: CommonExtensions.kt */
@Metadata(d1 = {"\u0000¦\u0001\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\r\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0011\n\u0002\b\n\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010$\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a%\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000*\b\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005\u001a\u0019\u0010\u0004\u001a\u00020\t*\u00020\u00062\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\u0004\u0010\n\u001a\u000f\u0010\f\u001a\u00020\u000bH\u0007¢\u0006\u0004\b\f\u0010\r\u001a\r\u0010\u0004\u001a\u00020\u000e¢\u0006\u0004\b\u0004\u0010\u000f\u001a\u0011\u0010\u0004\u001a\u00020\u000b*\u00020\u000b¢\u0006\u0004\b\u0004\u0010\u0010\u001a\u0019\u0010\u0004\u001a\u00020\u0013*\u00020\u00072\u0006\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\u0004\u0010\u0014\u001a\u0011\u0010\u0015\u001a\u00020\u000b*\u00020\u0007¢\u0006\u0004\b\u0015\u0010\u0016\u001a\u0011\u0010\f\u001a\u00020\u0017*\u00020\u0007¢\u0006\u0004\b\f\u0010\u0018\u001a\u001b\u0010\u0004\u001a\u00020\u0017*\u00020\u00072\u0006\u0010\u0019\u001a\u00020\u000bH\u0007¢\u0006\u0004\b\u0004\u0010\u001a\u001a\u001b\u0010\u0004\u001a\u0004\u0018\u00010\u000b*\u00020\u00112\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\u0004\u0010\u001b\u001a+\u0010\u0004\u001a\u0004\u0018\u00010\u0011*\u00020\u00072\b\u0010\u001c\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\u0012\u001a\u00020\u0011H\u0086@ø\u0001\u0000¢\u0006\u0004\b\u0004\u0010\u001d\u001a!\u0010\u0015\u001a\u0004\u0018\u00010\u0011*\u00020\u00112\u0006\u0010\b\u001a\u00020\u0007H\u0082@ø\u0001\u0000¢\u0006\u0004\b\u0015\u0010\u001e\u001a#\u0010\f\u001a\u0004\u0018\u00010\u000b*\u00020\u00112\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0086@ø\u0001\u0000¢\u0006\u0004\b\f\u0010\u001e\u001a\u0011\u0010\u0004\u001a\u00020 *\u00020\u001f¢\u0006\u0004\b\u0004\u0010!\u001a\u0019\u0010\f\u001a\u00020 *\u00020\"2\u0006\u0010#\u001a\u00020\u0013¢\u0006\u0004\b\f\u0010$\u001a\u0019\u0010\u0004\u001a\u00020 *\u00020\"2\u0006\u0010%\u001a\u00020\u0013¢\u0006\u0004\b\u0004\u0010$\u001a\u0011\u0010\f\u001a\u00020 *\u00020\"¢\u0006\u0004\b\f\u0010&\u001a%\u0010\u0015\u001a\u00020 2\u0016\u0010(\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\"0'\"\u0004\u0018\u00010\"¢\u0006\u0004\b\u0015\u0010)\u001a%\u0010\f\u001a\u00020 2\u0016\u0010(\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\"0'\"\u0004\u0018\u00010\"¢\u0006\u0004\b\f\u0010)\u001a%\u0010\u0004\u001a\u00020 2\u0016\u0010(\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\"0'\"\u0004\u0018\u00010\"¢\u0006\u0004\b\u0004\u0010)\u001aU\u0010\u0004\u001a\u00020 2\n\b\u0002\u0010*\u001a\u0004\u0018\u00010\u00172\n\b\u0002\u0010+\u001a\u0004\u0018\u00010\u00172\n\b\u0002\u0010,\u001a\u0004\u0018\u00010\u00172\n\b\u0002\u0010-\u001a\u0004\u0018\u00010\u00172\u0016\u0010(\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\"0'\"\u0004\u0018\u00010\"¢\u0006\u0004\b\u0004\u0010.\u001a\u0011\u0010\u0015\u001a\u00020\u0013*\u00020\"¢\u0006\u0004\b\u0015\u0010/\u001a\u0015\u0010\f\u001a\u00020\u00172\u0006\u00100\u001a\u00020\u0017¢\u0006\u0004\b\f\u00101\u001a!\u0010\u0004\u001a\u000204*\u0002022\u0006\u0010\b\u001a\u00020\u00072\u0006\u00103\u001a\u00020\u0017¢\u0006\u0004\b\u0004\u00105\u001a\u001b\u0010\u0004\u001a\u00020\u0017*\u00020\u00072\b\b\u0001\u00106\u001a\u00020\u0017¢\u0006\u0004\b\u0004\u00107\u001a\u001b\u0010\f\u001a\u00020\u0017*\u00020\u00072\b\b\u0001\u00108\u001a\u00020\u0017¢\u0006\u0004\b\f\u00107\u001a+\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020;09*\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020:09H\u0000¢\u0006\u0004\b\u0015\u0010<\u001a7\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u000109\"\u0004\b\u0000\u0010=\"\u0004\b\u0001\u0010>*\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0006\u0012\u0004\u0018\u00018\u000109¢\u0006\u0004\b\u0004\u0010<\u001a\u001b\u0010\f\u001a\u00020;*\n\u0012\u0002\b\u0003\u0012\u0002\b\u000309H\u0000¢\u0006\u0004\b\f\u0010?\u001aG\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u000109\"\u0004\b\u0000\u0010@\"\u0004\b\u0001\u0010A*\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001092\u0006\u0010B\u001a\u00028\u00002\b\u0010\u0019\u001a\u0004\u0018\u00018\u0001¢\u0006\u0004\b\u0004\u0010C\u001a\u001b\u0010\u0004\u001a\u00020 *\u00020D2\b\u0010E\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0004\u0010F\u001a\u0011\u0010\u0004\u001a\u00020 *\u00020G¢\u0006\u0004\b\u0004\u0010H\u001a#\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0000\"\u0004\b\u0000\u0010I*\b\u0012\u0004\u0012\u00028\u00000\u0000¢\u0006\u0004\b\u0004\u0010J\"\u0018\u0010M\u001a\u0004\u0018\u00010K8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0004\u0010L\"\u0015\u0010O\u001a\u00020\u000b*\u00020:8F¢\u0006\u0006\u001a\u0004\b\u0004\u0010N\"\u0015\u0010P\u001a\u00020\u0017*\u00020\u00178F¢\u0006\u0006\u001a\u0004\b\u0004\u00101\"\u0015\u0010S\u001a\u00020\u0013*\u00020Q8F¢\u0006\u0006\u001a\u0004\b\u0004\u0010R\"\u0017\u0010V\u001a\u0004\u0018\u00010T*\u00020\u00078F¢\u0006\u0006\u001a\u0004\b\u0004\u0010U\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006W"}, d2 = {"", "Lru/cyberity/cbr/core/data/model/Document;", "Lru/cyberity/cbr/core/data/model/g;", "applicant", "a", "(Ljava/util/List;Lru/cyberity/cbr/core/data/model/g;)Ljava/util/List;", "", "Landroid/content/Context;", "context", "Landroid/text/Spanned;", "(Ljava/lang/CharSequence;Landroid/content/Context;)Landroid/text/Spanned;", "", "b", "()Ljava/lang/String;", "Ljava/util/Locale;", "()Ljava/util/Locale;", "(Ljava/lang/String;)Ljava/lang/String;", "Landroid/net/Uri;", TooltipAttribute.PARAM_DEEP_LINK, "", "(Landroid/content/Context;Landroid/net/Uri;)Z", "c", "(Landroid/content/Context;)Ljava/lang/String;", "", "(Landroid/content/Context;)I", "value", "(Landroid/content/Context;Ljava/lang/String;)I", "(Landroid/net/Uri;Landroid/content/Context;)Ljava/lang/String;", "type", "(Landroid/content/Context;Ljava/lang/String;Landroid/net/Uri;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "(Landroid/net/Uri;Landroid/content/Context;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Landroid/app/Activity;", "Lkotlin/G0;", "(Landroid/app/Activity;)V", "Landroid/view/View;", "show", "(Landroid/view/View;Z)V", "gone", "(Landroid/view/View;)V", "", "views", "([Landroid/view/View;)V", "start", "end", "top", "bottom", "(Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;[Landroid/view/View;)V", "(Landroid/view/View;)Z", "degrees", "(I)I", "Landroid/content/res/TypedArray;", "index", "Landroid/content/res/ColorStateList;", "(Landroid/content/res/TypedArray;Landroid/content/Context;I)Landroid/content/res/ColorStateList;", "attrColor", "(Landroid/content/Context;I)I", "attr", "", "", "Lru/cyberity/cbr/core/data/model/remote/n;", "(Ljava/util/Map;)Ljava/util/Map;", "A", "B", "(Ljava/util/Map;)Lru/cyberity/cbr/core/data/model/remote/n;", "K", "V", "key", "(Ljava/util/Map;Ljava/lang/Object;Ljava/lang/Object;)Ljava/util/Map;", "Landroid/widget/TextView;", "text", "(Landroid/widget/TextView;Ljava/lang/CharSequence;)V", "Ljava/io/Closeable;", "(Ljava/io/Closeable;)V", "T", "(Ljava/util/List;)Ljava/util/List;", "Lio/noties/markwon/e;", "Lio/noties/markwon/e;", "markwon", "(Ljava/lang/Object;)Ljava/lang/String;", "instanceId", "px", "Landroid/content/res/Configuration;", "(Landroid/content/res/Configuration;)Z", "isDarkMode", "Landroidx/fragment/app/m;", "(Landroid/content/Context;)Landroidx/fragment/app/m;", "baseActivity", "cyberity-mobile-sdk-internal-core_release"}, k = 2, mv = {1, 7, 1})
/* loaded from: classes9.dex */
public final class s {

    /* renamed from: a, reason: collision with root package name */
    @Y61.l
    private static io.noties.markwon.e f432820a;

    /* compiled from: CommonExtensions.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "", "<anonymous>", "(Lkotlinx/coroutines/T;)Ljava/lang/String;"}, k = 3, mv = {1, 7, 1})
    @DebugMetadata(c = "ru.cyberity.cbr.core.common.CommonExtensionsKt$copyContentsToCacheFile$2", f = "CommonExtensions.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class b extends SuspendLambda implements Y41.p<T, Continuation<? super String>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f432822a;

        /* renamed from: b, reason: collision with root package name */
        private /* synthetic */ Object f432823b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ Context f432824c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ Uri f432825d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(Context context, Uri uri, Continuation<? super b> continuation) {
            super(2, continuation);
            this.f432824c = context;
            this.f432825d = uri;
        }

        @Override // Y41.p
        @Y61.l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(@Y61.k T t12, @Y61.l Continuation<? super String> continuation) {
            return ((b) create(t12, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            b bVar = new b(this.f432824c, this.f432825d, continuation);
            bVar.f432823b = obj;
            return bVar;
        }

        /* JADX WARN: Removed duplicated region for block: B:40:0x0082  */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(@Y61.k java.lang.Object r9) throws java.io.IOException {
            /*
                r8 = this;
                kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                int r0 = r8.f432822a
                if (r0 != 0) goto Lcf
                kotlin.C42729a0.b(r9)
                java.lang.Object r9 = r8.f432823b
                kotlinx.coroutines.T r9 = (kotlinx.coroutines.T) r9
                android.content.Context r0 = r8.f432824c
                r1 = 0
                if (r0 == 0) goto L24
                android.content.ContentResolver r2 = r0.getContentResolver()
                if (r2 == 0) goto L24
                android.net.Uri r3 = r8.f432825d
                r4 = 0
                r5 = 0
                r6 = 0
                r7 = 0
                android.database.Cursor r0 = r2.query(r3, r4, r5, r6, r7)
                goto L25
            L24:
                r0 = r1
            L25:
                r2 = -1
                if (r0 == 0) goto L2f
                java.lang.String r3 = "_display_name"
                int r3 = r0.getColumnIndex(r3)
                goto L30
            L2f:
                r3 = r2
            L30:
                if (r0 == 0) goto L39
                boolean r4 = r0.moveToFirst()
                kotlin.coroutines.jvm.internal.Boxing.boxBoolean(r4)
            L39:
                if (r3 != r2) goto L41
                if (r0 == 0) goto L40
                r0.close()
            L40:
                return r1
            L41:
                if (r0 == 0) goto L48
                java.lang.String r3 = r0.getString(r3)
                goto L49
            L48:
                r3 = r1
            L49:
                if (r0 == 0) goto L4e
                r0.close()
            L4e:
                if (r3 == 0) goto Lce
                int r0 = r3.length()
                if (r0 != 0) goto L58
                goto Lce
            L58:
                r0 = 6
                java.lang.String r4 = "."
                int r0 = kotlin.text.C43066x.N(r0, r3, r4)
                java.lang.Integer r0 = kotlin.coroutines.jvm.internal.Boxing.boxInt(r0)
                int r4 = r0.intValue()
                if (r4 <= r2) goto L6a
                goto L6b
            L6a:
                r0 = r1
            L6b:
                if (r0 == 0) goto L82
                int r0 = r0.intValue()
                java.lang.String r0 = r3.substring(r0)
                r2 = 47
                boolean r2 = kotlin.text.C43066x.r(r0, r2)
                if (r2 != 0) goto L7e
                goto L7f
            L7e:
                r0 = r1
            L7f:
                if (r0 == 0) goto L82
                goto L84
            L82:
                java.lang.String r0 = ""
            L84:
                java.lang.String r2 = "from_gallery"
                android.content.Context r3 = r8.f432824c     // Catch: java.lang.Exception -> Lb3
                java.io.File r3 = r3.getCacheDir()     // Catch: java.lang.Exception -> Lb3
                java.io.File r0 = java.io.File.createTempFile(r2, r0, r3)     // Catch: java.lang.Exception -> Lb3
                java.io.FileOutputStream r2 = new java.io.FileOutputStream     // Catch: java.lang.Exception -> Lb3
                r2.<init>(r0)     // Catch: java.lang.Exception -> Lb3
                android.content.Context r3 = r8.f432824c     // Catch: java.lang.Exception -> Lb3
                android.content.ContentResolver r3 = r3.getContentResolver()     // Catch: java.lang.Exception -> Lb3
                android.net.Uri r4 = r8.f432825d     // Catch: java.lang.Exception -> Lb3
                java.io.InputStream r3 = r3.openInputStream(r4)     // Catch: java.lang.Exception -> Lb3
                if (r3 != 0) goto La4
                return r1
            La4:
                boolean r2 = ru.cyberity.cbr.core.common.n.a(r3, r2)     // Catch: java.lang.Exception -> Lb3
                ru.cyberity.cbr.core.common.s.a(r3)     // Catch: java.lang.Exception -> Lb3
                java.lang.String r9 = r0.getPath()     // Catch: java.lang.Exception -> Lb3
                if (r2 == 0) goto Lb2
                r1 = r9
            Lb2:
                return r1
            Lb3:
                r0 = move-exception
                ru.cyberity.log.a r2 = ru.cyberity.log.a.f436064a
                java.lang.String r3 = ru.cyberity.log.c.a(r9)
                java.lang.StringBuilder r9 = new java.lang.StringBuilder
                java.lang.String r4 = "Error copying content: "
                r9.<init>(r4)
                r9.append(r0)
                java.lang.String r4 = r9.toString()
                r7 = 0
                r5 = 0
                r6 = 4
                ru.cyberity.log.logger.Logger.e$default(r2, r3, r4, r5, r6, r7)
            Lce:
                return r1
            Lcf:
                java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r9.<init>(r0)
                throw r9
            */
            throw new UnsupportedOperationException("Method not decompiled: ru.cyberity.cbr.core.common.s.b.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* compiled from: CommonExtensions.kt */
    @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
    @DebugMetadata(c = "ru.cyberity.cbr.core.common.CommonExtensionsKt", f = "CommonExtensions.kt", i = {}, l = {240, 244}, m = "copyFileFromActivityResultToCacheDir", n = {}, s = {})
    public static final class c extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        /* synthetic */ Object f432826a;

        /* renamed from: b, reason: collision with root package name */
        int f432827b;

        public c(Continuation<? super c> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            this.f432826a = obj;
            this.f432827b |= BeduinInputModel.MIN_TEXT_VERSION;
            return s.a(null, null, null, this);
        }
    }

    /* compiled from: CommonExtensions.kt */
    @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
    @DebugMetadata(c = "ru.cyberity.cbr.core.common.CommonExtensionsKt", f = "CommonExtensions.kt", i = {0, 0, 0, 1, 1, 2}, l = {272, 279, 283}, m = "copyFromImageGalleryToCacheIfPossible", n = {"context", "imageUri", "cursor", "context", "imageUri", "imageUri"}, s = {"L$0", "L$1", "L$2", "L$0", "L$1", "L$0"})
    public static final class d extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        Object f432828a;

        /* renamed from: b, reason: collision with root package name */
        Object f432829b;

        /* renamed from: c, reason: collision with root package name */
        Object f432830c;

        /* renamed from: d, reason: collision with root package name */
        /* synthetic */ Object f432831d;

        /* renamed from: e, reason: collision with root package name */
        int f432832e;

        public d(Continuation<? super d> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            this.f432831d = obj;
            this.f432832e |= BeduinInputModel.MIN_TEXT_VERSION;
            return s.c(null, null, this);
        }
    }

    public static final int b(int i12) {
        if (i12 == 90) {
            return 6;
        }
        if (i12 != 180) {
            return i12 != 270 ? 1 : 8;
        }
        return 3;
    }

    @Y61.k
    public static final String c(@Y61.k Context context) {
        try {
            return context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionName;
        } catch (Exception unused) {
            return "<unknown>";
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void d(View view) {
        if (view.requestFocus()) {
            ((InputMethodManager) view.getContext().getSystemService("input_method")).showSoftInput(view, 1);
        }
    }

    /* compiled from: CommonExtensions.kt */
    @Metadata(d1 = {"\u0000/\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\b\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u0010\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"ru/cyberity/cbr/core/common/s$a", "Lio/noties/markwon/a;", "Lio/noties/markwon/g$b;", "builder", "Lkotlin/G0;", "configureConfiguration", "(Lio/noties/markwon/g$b;)V", "Lio/noties/markwon/core/q$a;", "configureTheme", "(Lio/noties/markwon/core/q$a;)V", "", "markdown", "processMarkdown", "(Ljava/lang/String;)Ljava/lang/String;", "Lio/noties/markwon/j$b;", "registry", "configure", "(Lio/noties/markwon/j$b;)V", "cyberity-mobile-sdk-internal-core_release"}, k = 1, mv = {1, 7, 1})
    public static final class a extends AbstractC41740a {

        /* compiled from: CommonExtensions.kt */
        @Metadata(d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u001f\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"ru/cyberity/cbr/core/common/s$a$a", "Lio/noties/markwon/d;", "Landroid/view/View;", "view", "", "link", "Lkotlin/G0;", "resolve", "(Landroid/view/View;Ljava/lang/String;)V", "cyberity-mobile-sdk-internal-core_release"}, k = 1, mv = {1, 7, 1})
        /* renamed from: ru.cyberity.cbr.core.common.s$a$a, reason: collision with other inner class name */
        public static final class C12438a extends io.noties.markwon.d {
            @Override // io.noties.markwon.d, io.noties.markwon.InterfaceC41742c
            public void resolve(@Y61.k View view, @Y61.k String link) {
                try {
                    super.resolve(view, link);
                } catch (Exception unused) {
                    s.a(view.getContext(), Uri.parse(link));
                }
            }
        }

        /* compiled from: CommonExtensions.kt */
        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\r\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlin/text/n;", "matchResult", "", "a", "(Lkotlin/text/n;)Ljava/lang/CharSequence;"}, k = 3, mv = {1, 7, 1})
        public static final class b extends N implements Y41.l<InterfaceC43057n, CharSequence> {

            /* renamed from: a, reason: collision with root package name */
            public static final b f432821a = new b();

            public b() {
                super(1);
            }

            @Override // Y41.l
            @Y61.k
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final CharSequence invoke(@Y61.k InterfaceC43057n interfaceC43057n) {
                return AK.c.s(new StringBuilder("@@"), interfaceC43057n.d().get(1), "$$");
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void a(io.noties.markwon.simple.ext.e eVar) {
            eVar.a(new B());
        }

        @Override // io.noties.markwon.AbstractC41740a, io.noties.markwon.j
        public void configure(@Y61.k j.b registry) {
            registry.b(io.noties.markwon.simple.ext.e.class, new A());
        }

        @Override // io.noties.markwon.AbstractC41740a, io.noties.markwon.j
        public void configureConfiguration(@Y61.k g.b builder) {
            builder.f401721d = new C12438a();
        }

        @Override // io.noties.markwon.AbstractC41740a, io.noties.markwon.j
        public void configureTheme(@Y61.k q.a builder) {
            super.configureTheme(builder);
            builder.f401675d = s.a(4);
        }

        @Override // io.noties.markwon.AbstractC41740a, io.noties.markwon.j
        @Y61.k
        public String processMarkdown(@Y61.k String markdown) {
            return new C43059p("^><\\s*(.+\\S)\\s*$", RegexOption.f410583d).g(markdown, b.f432821a);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Object a(io.noties.markwon.g gVar, io.noties.markwon.y yVar) {
            return new AlignmentSpan.Standard(Layout.Alignment.ALIGN_CENTER);
        }
    }

    @Y61.k
    @SuppressLint({"DefaultLocale"})
    public static final String b() {
        String string = Build.MANUFACTURER;
        String str = Build.MODEL;
        Locale locale = Locale.ROOT;
        if (C43066x.h0(str.toLowerCase(locale), string.toLowerCase(locale), false)) {
            if (str.length() <= 0) {
                return str;
            }
            StringBuilder sb2 = new StringBuilder();
            char cCharAt = str.charAt(0);
            sb2.append((Object) (Character.isLowerCase(cCharAt) ? C43044a.e(cCharAt) : String.valueOf(cCharAt)));
            sb2.append(str.substring(1));
            return sb2.toString();
        }
        StringBuilder sb3 = new StringBuilder();
        if (string.length() > 0) {
            StringBuilder sb4 = new StringBuilder();
            char cCharAt2 = string.charAt(0);
            sb4.append((Object) (Character.isLowerCase(cCharAt2) ? C43044a.e(cCharAt2) : String.valueOf(cCharAt2)));
            sb4.append(string.substring(1));
            string = sb4.toString();
        }
        return H.o(sb3, string, ' ', str);
    }

    @Y61.k
    public static final String a(@Y61.k Object obj) {
        return obj.getClass().getSimpleName() + '@' + System.identityHashCode(obj);
    }

    @Y61.k
    public static final Spanned a(@Y61.k CharSequence charSequence, @Y61.k Context context) {
        try {
            io.noties.markwon.e eVarBuild = f432820a;
            if (eVarBuild == null) {
                e.a aVarA = io.noties.markwon.e.a(context);
                aVarA.a(new io.noties.markwon.html.e());
                aVarA.a(new io.noties.markwon.linkify.a());
                aVarA.a(new io.noties.markwon.simple.ext.e());
                aVarA.a(new a());
                eVarBuild = aVarA.build();
                f432820a = eVarBuild;
            }
            return eVarBuild.b(charSequence.toString());
        } catch (Exception unused) {
            return new SpannableString(charSequence);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00ec  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object c(android.net.Uri r17, android.content.Context r18, kotlin.coroutines.Continuation<? super android.net.Uri> r19) {
        /*
            Method dump skipped, instructions count: 266
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ru.cyberity.cbr.core.common.s.c(android.net.Uri, android.content.Context, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public static final int b(@Y61.k Context context) {
        try {
            return (int) androidx.core.content.pm.b.a(context.getPackageManager().getPackageInfo(context.getPackageName(), 0));
        } catch (Exception unused) {
            return -1;
        }
    }

    public static final void b(@Y61.k View view, boolean z12) {
        view.setVisibility(z12 ? 0 : 4);
    }

    public static final void b(@Y61.k View view) {
        ((InputMethodManager) view.getContext().getSystemService("input_method")).hideSoftInputFromWindow(view.getWindowToken(), 0);
    }

    public static final int a(int i12) {
        return (int) (i12 * Resources.getSystem().getDisplayMetrics().density);
    }

    @Y61.k
    public static final Locale a() {
        return LocaleList.getDefault().get(0);
    }

    @Y61.k
    public static final String a(@Y61.k String str) {
        return Base64.getEncoder().encodeToString(str.getBytes(StandardCharsets.UTF_8));
    }

    public static final int b(@Y61.k Context context, @InterfaceC42150f int i12) {
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(i12, typedValue, true);
        return typedValue.resourceId;
    }

    public static final boolean a(@Y61.k Context context, @Y61.k Uri uri) {
        Intent intent = new Intent("android.intent.action.VIEW");
        intent.setData(uri);
        if (intent.resolveActivity(context.getPackageManager()) != null) {
            try {
                context.startActivity(intent);
                return true;
            } catch (Exception e12) {
                ru.cyberity.log.a.f436064a.e(ru.cyberity.log.c.a(context), "Error while opening activity", e12);
            }
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0 */
    /* JADX WARN: Type inference failed for: r2v1, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r2v3, types: [java.util.ArrayList] */
    @Y61.k
    public static final ru.cyberity.cbr.core.data.model.remote.n b(@Y61.k Map<?, ?> map) {
        Object obj = map.get("regex");
        ?? SingletonList = 0;
        String str = obj instanceof String ? (String) obj : null;
        Object obj2 = map.get("placeholders");
        List list = obj2 instanceof List ? (List) obj2 : null;
        if (list != null) {
            SingletonList = new ArrayList();
            for (Object obj3 : list) {
                if (obj3 instanceof String) {
                    SingletonList.add(obj3);
                }
            }
        } else {
            Object obj4 = map.get(ChannelContext.Item.PLACEHOLDER);
            String str2 = obj4 instanceof String ? (String) obj4 : null;
            if (str2 != null) {
                SingletonList = Collections.singletonList(str2);
            }
        }
        return new ru.cyberity.cbr.core.data.model.remote.n(SingletonList, str);
    }

    @SuppressLint({"DiscouragedApi"})
    public static final int a(@Y61.k Context context, @Y61.k String str) {
        return context.getResources().getIdentifier(str, "drawable", context.getPackageName());
    }

    @Y61.l
    public static final String a(@Y61.k Uri uri, @Y61.k Context context) {
        String path = uri.getPath();
        if (path == null || path.length() == 0) {
            return null;
        }
        String type = context.getContentResolver().getType(uri);
        if (type != null) {
            return type;
        }
        try {
            return URLConnection.guessContentTypeFromName(new File(uri.getPath()).getName());
        } catch (Exception unused) {
            return type;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x0081 A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Y61.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object a(@Y61.k android.content.Context r5, @Y61.l java.lang.String r6, @Y61.k android.net.Uri r7, @Y61.k kotlin.coroutines.Continuation<? super android.net.Uri> r8) {
        /*
            boolean r0 = r8 instanceof ru.cyberity.cbr.core.common.s.c
            if (r0 == 0) goto L13
            r0 = r8
            ru.cyberity.cbr.core.common.s$c r0 = (ru.cyberity.cbr.core.common.s.c) r0
            int r1 = r0.f432827b
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f432827b = r1
            goto L18
        L13:
            ru.cyberity.cbr.core.common.s$c r0 = new ru.cyberity.cbr.core.common.s$c
            r0.<init>(r8)
        L18:
            java.lang.Object r8 = r0.f432826a
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.f432827b
            r3 = 1
            r4 = 2
            if (r2 == 0) goto L38
            if (r2 == r3) goto L34
            if (r2 != r4) goto L2c
            kotlin.C42729a0.b(r8)
            goto L7d
        L2c:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L34:
            kotlin.C42729a0.b(r8)
            goto L96
        L38:
            kotlin.C42729a0.b(r8)
            if (r6 != 0) goto L41
            java.lang.String r6 = a(r7, r5)
        L41:
            if (r6 == 0) goto L8d
            int r8 = r6.length()
            if (r8 != 0) goto L4a
            goto L8d
        L4a:
            java.lang.String r8 = "image"
            r2 = 0
            boolean r8 = kotlin.text.C43066x.h0(r6, r8, r2)
            if (r8 != 0) goto L8d
            java.lang.String r8 = "/image"
            boolean r6 = kotlin.text.C43066x.z(r6, r8, r2)
            if (r6 == 0) goto L5c
            goto L8d
        L5c:
            java.lang.String r6 = r7.toString()
            java.lang.String r8 = "content://"
            boolean r6 = kotlin.text.C43066x.h0(r6, r8, r2)
            if (r6 != 0) goto L74
            java.lang.String r6 = r7.toString()
            java.lang.String r8 = "file://"
            boolean r6 = kotlin.text.C43066x.h0(r6, r8, r2)
            if (r6 == 0) goto L99
        L74:
            r0.f432827b = r4
            java.lang.Object r8 = b(r7, r5, r0)
            if (r8 != r1) goto L7d
            return r1
        L7d:
            java.lang.String r8 = (java.lang.String) r8
            if (r8 != 0) goto L83
            r7 = 0
            goto L99
        L83:
            java.io.File r5 = new java.io.File
            r5.<init>(r8)
            android.net.Uri r7 = android.net.Uri.fromFile(r5)
            goto L99
        L8d:
            r0.f432827b = r3
            java.lang.Object r8 = c(r7, r5, r0)
            if (r8 != r1) goto L96
            return r1
        L96:
            r7 = r8
            android.net.Uri r7 = (android.net.Uri) r7
        L99:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: ru.cyberity.cbr.core.common.s.a(android.content.Context, java.lang.String, android.net.Uri, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public static final boolean c(@Y61.k View view) {
        return view.postDelayed(new U(view, 8), view.getResources().getInteger(R.integer.config_shortAnimTime));
    }

    @Y61.l
    public static final Object b(@Y61.k Uri uri, @Y61.l Context context, @Y61.k Continuation<? super String> continuation) {
        return C43259k.g(C43262l0.f411947c, new b(context, uri, null), continuation);
    }

    public static final void b(@Y61.k View... viewArr) {
        for (View view : viewArr) {
            if (view != null) {
                view.setVisibility(4);
            }
        }
    }

    public static final void c(@Y61.k View... viewArr) {
        for (View view : viewArr) {
            if (view != null) {
                view.setVisibility(0);
            }
        }
    }

    @Y61.k
    public static final Map<String, ru.cyberity.cbr.core.data.model.remote.n> c(@Y61.k Map<String, ? extends Object> map) {
        ArrayList arrayList = new ArrayList();
        for (Map.Entry<String, ? extends Object> entry : map.entrySet()) {
            String key = entry.getKey();
            Object value = entry.getValue();
            Map map2 = value instanceof Map ? (Map) value : null;
            ru.cyberity.cbr.core.data.model.remote.n nVarB = map2 != null ? b((Map<?, ?>) map2) : null;
            Q q12 = nVarB != null ? new Q(key, nVarB) : null;
            if (q12 != null) {
                arrayList.add(q12);
            }
        }
        return P0.p(arrayList);
    }

    public static final void a(@Y61.k Activity activity) {
        Intent intent = new Intent();
        intent.setAction("android.settings.APPLICATION_DETAILS_SETTINGS");
        intent.setData(Uri.fromParts("package", activity.getPackageName(), null));
        activity.startActivity(intent);
    }

    public static final void a(@Y61.k View view, boolean z12) {
        view.setVisibility(z12 ? 8 : 0);
    }

    @Y61.k
    public static final ColorStateList a(@Y61.k TypedArray typedArray, @Y61.k Context context, int i12) {
        switch (typedArray.getType(i12)) {
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
            case AvailableCode.HMS_IS_SPOOF /* 29 */:
            case 30:
            case 31:
                return ColorStateList.valueOf(typedArray.getColor(i12, 0));
            default:
                int resourceId = typedArray.getResourceId(i12, -1);
                if (resourceId != -1) {
                    return androidx.core.content.d.getColorStateList(context, resourceId);
                }
                return ColorStateList.valueOf(0);
        }
    }

    public static final boolean a(@Y61.k Configuration configuration) {
        return (configuration.uiMode & 48) == 32;
    }

    public static final int a(@Y61.k Context context, @InterfaceC42150f int i12) {
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(i12, typedValue, true);
        return typedValue.data;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Y61.k
    public static final <K, V> Map<K, V> a(@Y61.k Map<K, ? extends V> map, K k12, @Y61.l V v12) {
        if (v12 == null && !map.containsKey(k12)) {
            return map;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.putAll(map);
        if (v12 == null) {
            linkedHashMap.remove(k12);
        } else {
            linkedHashMap.put(k12, v12);
        }
        return linkedHashMap;
    }

    @Y61.l
    public static final ActivityC22955m a(@Y61.k Context context) {
        if (context instanceof ActivityC22955m) {
            return (ActivityC22955m) context;
        }
        if (context instanceof androidx.appcompat.view.d) {
            Context baseContext = ((androidx.appcompat.view.d) context).getBaseContext();
            if (baseContext instanceof ActivityC22955m) {
                return (ActivityC22955m) baseContext;
            }
        }
        return null;
    }

    public static final void a(@Y61.k TextView textView, @Y61.l CharSequence charSequence) {
        if (charSequence != null && !C43066x.K(charSequence)) {
            textView.setText(charSequence);
            textView.setVisibility(0);
        } else {
            textView.setVisibility(8);
        }
    }

    public static final void a(@Y61.k Closeable closeable) throws IOException {
        try {
            closeable.close();
        } catch (RuntimeException e12) {
            throw e12;
        } catch (Exception unused) {
        }
    }

    @Y61.k
    public static final List<Document> a(@Y61.k List<Document> list, @Y61.k ru.cyberity.cbr.core.data.model.g gVar) {
        List<String> listJ;
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            Document document = (Document) obj;
            if (gVar.getRequiredIdDocs().getVideoIdent() && ((listJ = gVar.getRequiredIdDocs().j()) == null || !listJ.contains(document.getType().getValue()))) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    public static final void a(@Y61.k View... viewArr) {
        for (View view : viewArr) {
            if (view != null) {
                view.setVisibility(8);
            }
        }
    }

    public static final void a(@Y61.l Integer num, @Y61.l Integer num2, @Y61.l Integer num3, @Y61.l Integer num4, @Y61.k View... viewArr) {
        int length = viewArr.length;
        for (int i12 = 0; i12 < length; i12++) {
            View view = viewArr[i12];
            ViewGroup.LayoutParams layoutParams = view != null ? view.getLayoutParams() : null;
            ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams : null;
            if (marginLayoutParams != null) {
                if (num != null) {
                    marginLayoutParams.setMarginStart(num.intValue());
                }
                if (num2 != null) {
                    marginLayoutParams.setMarginEnd(num2.intValue());
                }
                if (num3 != null) {
                    marginLayoutParams.topMargin = num3.intValue();
                }
                if (num4 != null) {
                    marginLayoutParams.bottomMargin = num4.intValue();
                }
            }
        }
    }

    @Y61.k
    public static final <A, B> Map<A, B> a(@Y61.k Map<A, ? extends B> map) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry<A, ? extends B> entry : map.entrySet()) {
            if (entry.getValue() != null) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        return linkedHashMap;
    }

    @Y61.k
    public static final <T> List<T> a(@Y61.k List<? extends T> list) {
        return Collections.unmodifiableList(new ArrayList(list));
    }
}
