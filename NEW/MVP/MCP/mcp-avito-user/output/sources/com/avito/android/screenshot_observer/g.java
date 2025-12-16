package com.avito.android.screenshot_observer;

import Y41.p;
import Y61.k;
import Y61.l;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import com.avito.android.util.C;
import com.avito.android.util.V2;
import javax.inject.Inject;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.text.C43066x;
import kotlinx.coroutines.C43259k;
import kotlinx.coroutines.C43262l0;
import kotlinx.coroutines.T;

/* compiled from: ScreenshotValidator.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/screenshot_observer/g;", "Lcom/avito/android/screenshot_observer/f;", "_avito_screenshot-observer_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class g implements f {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final Context f261700a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final C f261701b;

    /* compiled from: ScreenshotValidator.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "", "<anonymous>", "(Lkotlinx/coroutines/T;)Z"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.screenshot_observer.ScreenshotValidatorImpl$isScreenshot$2", f = "ScreenshotValidator.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class a extends SuspendLambda implements p<T, Continuation<? super Boolean>, Object> {

        /* renamed from: r, reason: collision with root package name */
        public final /* synthetic */ Uri f261703r;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Uri uri, Continuation<? super a> continuation) {
            super(2, continuation);
            this.f261703r = uri;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @k
        public final Continuation<G0> create(@l Object obj, @k Continuation<?> continuation) {
            return g.this.new a(this.f261703r, continuation);
        }

        @Override // Y41.p
        public final Object invoke(T t12, Continuation<? super Boolean> continuation) {
            return ((a) create(t12, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @l
        public final Object invokeSuspend(@k Object obj) throws Throwable {
            Cursor cursor;
            boolean zQ2;
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            C42729a0.b(obj);
            g gVar = g.this;
            int iJ2 = gVar.f261701b.j();
            Uri uri = this.f261703r;
            Context context = gVar.f261700a;
            boolean z12 = false;
            Cursor cursor2 = null;
            if (iJ2 >= 29) {
                try {
                    try {
                        Cursor cursorQuery = context.getContentResolver().query(uri, new String[]{"_display_name", "relative_path"}, null, null, "_id DESC");
                        if (cursorQuery != null) {
                            try {
                                cursor = cursorQuery;
                                try {
                                    Cursor cursor3 = cursor;
                                    int columnIndex = cursor3.getColumnIndex("relative_path");
                                    int columnIndex2 = cursor3.getColumnIndex("_display_name");
                                    if (cursor3.moveToFirst()) {
                                        zQ2 = C43066x.q(cursorQuery.getString(columnIndex2), "screenshot", true) | C43066x.q(cursorQuery.getString(columnIndex), "screenshot", true);
                                        kotlin.io.c.a(cursor, null);
                                        cursorQuery.close();
                                        z12 = zQ2;
                                    } else {
                                        G0 g02 = G0.f406611a;
                                        kotlin.io.c.a(cursor, null);
                                    }
                                } finally {
                                }
                            } catch (Exception e12) {
                                e = e12;
                                cursor2 = cursorQuery;
                                V2.f318762a.f(e);
                                Cursor cursor4 = cursor2;
                                if (cursor4 != null) {
                                    cursor4.close();
                                }
                                return Boxing.boxBoolean(z12);
                            } catch (Throwable th2) {
                                th = th2;
                                cursor2 = cursorQuery;
                                Cursor cursor5 = cursor2;
                                if (cursor5 != null) {
                                    cursor5.close();
                                }
                                throw th;
                            }
                        }
                        if (cursorQuery != null) {
                            cursorQuery.close();
                        }
                    } catch (Exception e13) {
                        e = e13;
                    }
                } catch (Throwable th3) {
                    th = th3;
                }
            } else {
                try {
                    try {
                        Cursor cursorQuery2 = context.getContentResolver().query(uri, new String[]{"_data"}, null, null, "_id DESC");
                        if (cursorQuery2 != null) {
                            try {
                                cursor = cursorQuery2;
                                try {
                                    Cursor cursor6 = cursor;
                                    int columnIndex3 = cursor6.getColumnIndex("_data");
                                    if (cursor6.moveToFirst()) {
                                        zQ2 = C43066x.q(cursorQuery2.getString(columnIndex3), "screenshot", true);
                                        kotlin.io.c.a(cursor, null);
                                        cursorQuery2.close();
                                        z12 = zQ2;
                                    } else {
                                        G0 g03 = G0.f406611a;
                                        kotlin.io.c.a(cursor, null);
                                    }
                                } finally {
                                }
                            } catch (Exception e14) {
                                e = e14;
                                cursor2 = cursorQuery2;
                                V2.f318762a.f(e);
                                Cursor cursor7 = cursor2;
                                if (cursor7 != null) {
                                    cursor7.close();
                                }
                                return Boxing.boxBoolean(z12);
                            } catch (Throwable th4) {
                                th = th4;
                                cursor2 = cursorQuery2;
                                Cursor cursor8 = cursor2;
                                if (cursor8 != null) {
                                    cursor8.close();
                                }
                                throw th;
                            }
                        }
                        if (cursorQuery2 != null) {
                            cursorQuery2.close();
                        }
                    } catch (Exception e15) {
                        e = e15;
                    }
                } catch (Throwable th5) {
                    th = th5;
                }
            }
            return Boxing.boxBoolean(z12);
        }
    }

    @Inject
    public g(@k Context context, @k C c12) {
        this.f261700a = context;
        this.f261701b = c12;
    }

    @Override // com.avito.android.screenshot_observer.f
    @l
    public final Object a(@k Uri uri, @k Continuation<? super Boolean> continuation) {
        return C43259k.g(C43262l0.f411947c, new a(uri, null), continuation);
    }
}
