package defpackage;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.b;
import androidx.media3.common.VideoFrameProcessingException;
import java.net.Socket;
import java.util.List;
import javax.inject.Provider;
import one.me.common.drawable.SavedMessagesIconDrawable;
import one.me.folders.edit.FolderEditScreen;
import one.me.sdk.uikit.common.views.OneMeDraweeView;
import org.apache.http.util.LangUtils;
import ru.ok.android.externcalls.analytics.internal.event.EventQueueCollector;
import ru.ok.android.externcalls.analytics.internal.upload.Uploader;
import ru.ok.android.externcalls.sdk.utils.cancelable.Cancelable;
import ru.ok.messages.media.mediabar.ActLocalMedias;
import ru.ok.messages.media.mediabar.FrgLocalVideo;
import ru.ok.tamtam.nano.Protos;

/* loaded from: classes2.dex */
public final /* synthetic */ class wo4 implements w2f, gu3, z3h, lyf, Cancelable, nk8, Uploader.IdleStateProvider, Provider, oa8, pa8, uy, ln0, mn0, uu1, b9e, om6, zua {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ wo4(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    @Override // defpackage.zua
    public g4i I(View view, g4i g4iVar) {
        int contentHeight;
        FrgLocalVideo frgLocalVideo = (FrgLocalVideo) this.b;
        b bVarT = frgLocalVideo.t();
        if (bVarT == null) {
            contentHeight = 0;
        } else {
            int iA = vw4.a(bVarT);
            if (bVarT instanceof ActLocalMedias) {
                ActLocalMedias actLocalMedias = (ActLocalMedias) bVarT;
                eba ebaVar = actLocalMedias.g1;
                if (ebaVar != null) {
                    contentHeight = actLocalMedias.c1.getContentHeight() + ((View) ebaVar.c).getHeight();
                } else {
                    contentHeight = actLocalMedias.c1.getContentHeight();
                }
            } else {
                contentHeight = iA;
            }
        }
        Rect rect = new Rect(g4iVar.b(), g4iVar.d(), g4iVar.c(), contentHeight);
        yaa yaaVar = frgLocalVideo.C1;
        if (yaaVar != null) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) yaaVar.z0.getLayoutParams();
            marginLayoutParams.topMargin = rect.top;
            marginLayoutParams.bottomMargin = rect.bottom;
            yaaVar.z0.setLayoutParams(marginLayoutParams);
            View view2 = yaaVar.B0;
            view2.setPadding(rect.left, view2.getPaddingTop(), rect.right, yaaVar.B0.getPaddingBottom());
        }
        return g4iVar;
    }

    @Override // defpackage.ln0
    public long a(long j) {
        switch (this.a) {
            case SavedMessagesIconDrawable.NORMAL_ICON_SIZE /* 24 */:
                return xxg.j((j * r0.f) / 1000000, 0L, ((x16) this.b).k - 1);
            default:
                return zxg.j((j * r0.f) / 1000000, 0L, ((x16) this.b).k - 1);
        }
    }

    @Override // defpackage.gu3
    public void accept(Object obj) {
        int i = this.a;
        Object obj2 = this.b;
        switch (i) {
            case 1:
                ypc ypcVar = (ypc) obj;
                wqi.c("xo4", "success connect to host: %s", ypcVar.f.toString());
                ((xo4) obj2).l(ypcVar);
                break;
            default:
                pb5 pb5Var = (pb5) obj2;
                List list = (List) obj;
                pb5Var.c = list;
                pb5Var.a.f(list);
                break;
        }
    }

    @Override // defpackage.om6, defpackage.tm6
    public Object apply(Object obj) {
        dfg dfgVar = (dfg) obj;
        ((jj6) this.b).getClass();
        return dfgVar;
    }

    @Override // ru.ok.android.externcalls.sdk.utils.cancelable.Cancelable
    public void cancel() {
        ((py4) this.b).dispose();
    }

    @Override // defpackage.z3h
    public void d(VideoFrameProcessingException videoFrameProcessingException) {
        f7a f7aVar = (f7a) ((a3b) this.b).b;
        f7aVar.f.execute(new k79(f7aVar, 9, videoFrameProcessingException));
    }

    @Override // defpackage.uy, defpackage.bh8
    public void error(String str, Throwable th) {
        ((zw5) this.b).a.error(str, th);
    }

    @Override // defpackage.nk8
    public void f() {
        OneMeDraweeView oneMeDraweeView = ((fc5) this.b).F0;
        if (oneMeDraweeView != null) {
            oneMeDraweeView.setVisibility(8);
        }
    }

    @Override // defpackage.b9e
    public int g(int i) {
        int iM = ((t98) ((FolderEditScreen) this.b).o.C(i)).getK0();
        if ((536870911 & iM) == 8) {
            return 0;
        }
        if ((536870912 & iM) != 0) {
            return 1;
        }
        if ((1073741824 & iM) != 0) {
            return 2;
        }
        return (iM & Integer.MIN_VALUE) != 0 ? 3 : 4;
    }

    @Override // javax.inject.Provider
    public Object get() {
        return ((Uploader) this.b).getSink();
    }

    @Override // defpackage.lyf
    public void h(iyf iyfVar, int i) {
        neb nebVar = (neb) this.b;
        View view = iyfVar.b;
        meb mebVar = view instanceof meb ? (meb) view : null;
        dv4 dv4Var = (dv4) ev4.a.get(i);
        boolean z = i == nebVar.getSelectedTabPosition();
        aya ayaVar = new aya(String.valueOf(dv4Var.a), z ? 1 : 2, 56, dv4Var.b);
        if (mebVar != null) {
            mebVar.setTabItem(ayaVar);
            return;
        }
        meb mebVar2 = new meb(nebVar.getContext());
        mebVar2.setTabItem(ayaVar);
        iyfVar.b = mebVar2;
        kyf kyfVar = iyfVar.d;
        if (kyfVar != null) {
            kyfVar.d();
        }
    }

    @Override // defpackage.w2f
    public void i(i2f i2fVar) throws Exception {
        ypc ypcVar = (ypc) this.b;
        nr3 nr3Var = ypcVar.f;
        try {
            if (i2fVar.e()) {
                return;
            }
            wqi.c("xo4", "start connect to host: %s", nr3Var.toString());
            try {
                ypcVar.e = i2fVar;
                ypcVar.connect();
                i2fVar.a(ypcVar);
            } catch (Exception e) {
                wqi.c("xo4", "close socket for host: %s", nr3Var.toString());
                Socket socket = ypcVar.d;
                if (socket != null) {
                    try {
                        socket.close();
                    } catch (Exception unused) {
                    }
                }
                throw e;
            }
        } catch (Exception e2) {
            if (i2fVar.e()) {
                return;
            }
            i2fVar.onError(e2);
        }
    }

    @Override // defpackage.oa8
    public void invoke(Object obj) {
        switch (this.a) {
            case Protos.Attaches.Attach.PRESENT /* 12 */:
                ((q3c) obj).t((v19) this.b);
                break;
            case 13:
                ((r3c) obj).A((egg) this.b);
                break;
            case Protos.Attaches.Attach.LOCATION /* 14 */:
                ((r3c) obj).W((ib4) this.b);
                break;
            case Protos.Attaches.Attach.DAILY_MEDIA /* 15 */:
                ((q3c) obj).t(((xl5) this.b).a.U0);
                break;
            case 16:
                ((r3c) obj).i0(((yl5) this.b).a.Z0);
                break;
            case LangUtils.HASH_SEED /* 17 */:
                ((q3c) obj).v((sy9) this.b);
                break;
            case 18:
                ((r3c) obj).D0((ty9) this.b);
                break;
            case 19:
                ((q3c) obj).r((kv4) this.b);
                break;
            case 20:
                ((r3c) obj).g((sch) this.b);
                break;
            default:
                ((w86) this.b).getClass();
                ((ra9) obj).getClass();
                break;
        }
    }

    @Override // ru.ok.android.externcalls.analytics.internal.upload.Uploader.IdleStateProvider
    public boolean isIdle() {
        return ((EventQueueCollector.IdleStateProvider) this.b).isIdle();
    }

    @Override // defpackage.uu1
    public String m(tu1 tu1Var) {
        c86 c86Var = (c86) this.b;
        c86Var.b.execute(new qz5(c86Var, 5, tu1Var));
        return "triggerAePrecapture";
    }

    public /* synthetic */ wo4(w86 w86Var, chg chgVar) {
        this.a = 22;
        this.b = w86Var;
    }

    public /* synthetic */ wo4(Object obj, int i, Object obj2) {
        this.a = i;
        this.b = obj2;
    }
}
