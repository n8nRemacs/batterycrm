package defpackage;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;
import ru.ok.messages.media.mediabar.ActLocalMedias;
import ru.ok.messages.media.trim.ActTrimVideo;
import ru.ok.messages.media.trim.FrgTrimVideo;
import ru.ok.messages.photoeditor.ActPhotoEditor;
import ru.ok.messages.views.dialogs.ConfirmationDialog;
import ru.ok.tamtam.messages.scheduled.ScheduledSendPickerDialogFragment;
import ru.ok.tamtam.nano.Protos;

/* loaded from: classes2.dex */
public final /* synthetic */ class bba implements ju3 {
    public final /* synthetic */ int a;

    public /* synthetic */ bba(int i) {
        this.a = i;
    }

    @Override // defpackage.ju3
    public final void accept(Object obj) {
        l95 l95Var = null;
        final int i = 0;
        final int i2 = 1;
        switch (this.a) {
            case 0:
                eaa eaaVar = (eaa) obj;
                eaaVar.getClass();
                wqi.c("eaa", "onTrimButtonClicked", new Object[0]);
                pd8 pd8Var = eaaVar.o;
                if (pd8Var != null && pd8Var.b()) {
                    ActLocalMedias actLocalMedias = eaaVar.c;
                    String str = eaaVar.o.c;
                    p2h p2hVar = eaaVar.s0;
                    float f = p2hVar.b;
                    float f2 = eaaVar.Z;
                    long j = (long) (f * f2);
                    long j2 = (long) (p2hVar.c * f2);
                    boolean z = p2hVar.d;
                    Uri uri = Uri.parse(str);
                    Intent intent = new Intent(actLocalMedias, (Class<?>) ActTrimVideo.class);
                    intent.putExtra("ru.ok.tamtam.extra.VIDEO_URI", uri);
                    intent.putExtra("ru.ok.tamtam.extra.START_POSITION", j);
                    intent.putExtra("ru.ok.tamtam.extra.END_POSITION", j2);
                    intent.putExtra("ru.ok.tamtam.extra.MUTE", z);
                    actLocalMedias.startActivityForResult(intent, 1);
                    break;
                }
                break;
            case 1:
                eaa eaaVar2 = (eaa) obj;
                pd8 pd8Var2 = eaaVar2.o;
                if (pd8Var2 != null && pd8Var2.a == 1 && !pd8Var2.d()) {
                    zub zubVar = eaaVar2.t0;
                    l95 l95Var2 = zubVar != null ? zubVar.d : null;
                    pd8 pd8Var3 = eaaVar2.o;
                    if (zubVar != null && zubVar.o != null) {
                        l95Var = l95Var2;
                    }
                    Uri uriA = zub.a(zubVar, pd8Var3);
                    ActLocalMedias actLocalMedias2 = eaaVar2.c;
                    if (uriA != null) {
                        Intent intent2 = new Intent(actLocalMedias2, (Class<?>) ActPhotoEditor.class);
                        intent2.putExtra("photo_editor:background_uri", uriA);
                        if (l95Var != null) {
                            intent2.putExtra("photo_editor:editor_state", l95Var);
                        }
                        intent2.putExtra("photo_editor:draw_sticker_enabled", false);
                        actLocalMedias2.startActivityForResult(intent2, 3);
                        break;
                    } else {
                        Intent intent3 = new Intent(actLocalMedias2, (Class<?>) ActPhotoEditor.class);
                        intent3.putExtra("photo_editor:is_drawing", true);
                        if (l95Var != null) {
                            intent3.putExtra("photo_editor:editor_state", l95Var);
                        }
                        intent3.putExtra("photo_editor:draw_sticker_enabled", false);
                        actLocalMedias2.startActivityForResult(intent3, 3);
                        break;
                    }
                }
                break;
            case 2:
                eaa eaaVar3 = (eaa) obj;
                eaaVar3.getClass();
                wqi.c("eaa", "On mute button clicked", new Object[0]);
                p2h p2hVar2 = eaaVar3.s0;
                boolean z2 = p2hVar2.d;
                final boolean z3 = !z2;
                u10 u10VarA = p2hVar2.a();
                u10VarA.d = z3;
                eaaVar3.s0 = new p2h(u10VarA);
                eaaVar3.O0();
                eaaVar3.P0(new dn6() { // from class: baa
                    @Override // defpackage.dn6
                    public final Object apply(Object obj2) {
                        le8 le8Var = (le8) obj2;
                        le8Var.n = z3;
                        return le8Var;
                    }
                });
                eaaVar3.c.T(z2, true);
                eaaVar3.u0.c(z3 ? 1 : 0, "MUTE_VIDEO_BEFORE_SEND");
                break;
            case 3:
                final naa naaVar = (naa) obj;
                naaVar.d.e("ACTION_LOCAL_MEDIA_TRIM_APPLY");
                kba kbaVar = (kba) ((oaa) naaVar.b);
                zg zgVar = kbaVar.Y;
                zgVar.f(kbaVar.B0);
                zgVar.e(kbaVar.C0);
                yni.h((ViewGroup) ((View) kbaVar.c));
                FrgTrimVideo frgTrimVideo = naaVar.c;
                String str2 = naaVar.o;
                long j3 = naaVar.Z;
                frgTrimVideo.getClass();
                pv3 pv3Var = new pv3(frgTrimVideo, str2, j3);
                int i3 = 2;
                new wk3(i3, pv3Var).m(u0e.a()).i(de.a()).k(new qu1(new gu3() { // from class: maa
                    /* JADX WARN: Removed duplicated region for block: B:11:0x0046  */
                    @Override // defpackage.gu3
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                        To view partially-correct add '--show-bad-code' argument
                    */
                    public final void accept(java.lang.Object r8) {
                        /*
                            r7 = this;
                            int r0 = r2
                            switch(r0) {
                                case 0: goto L35;
                                default: goto L5;
                            }
                        L5:
                            java.lang.String r8 = (java.lang.String) r8
                            naa r0 = r1
                            ru.ok.messages.media.trim.FrgTrimVideo r1 = r0.c
                            long r2 = r0.Z
                            long r4 = r0.s0
                            r1.getClass()
                            android.content.Intent r0 = new android.content.Intent
                            r0.<init>()
                            java.lang.String r6 = "ru.ok.tamtam.extra.START_POSITION"
                            r0.putExtra(r6, r2)
                            java.lang.String r2 = "ru.ok.tamtam.extra.END_POSITION"
                            r0.putExtra(r2, r4)
                            java.lang.String r2 = "ru.ok.tamtam.extra.THUMBNAIL_URI"
                            r0.putExtra(r2, r8)
                            d6 r8 = r1.u0()
                            r2 = -1
                            r8.setResult(r2, r0)
                            r1.B0()
                            r1.s0()
                            return
                        L35:
                            java.lang.Long r8 = (java.lang.Long) r8
                            naa r8 = r1
                            xd8 r0 = r8.X
                            f2h r1 = r0.f
                            if (r1 != 0) goto L40
                            goto L46
                        L40:
                            fl5 r0 = r0.b
                            f2h r1 = r0.Y
                            if (r1 != 0) goto L49
                        L46:
                            r0 = 0
                            goto L57
                        L49:
                            j1f r1 = r0.a
                            long r1 = r1.e()
                            f2h r0 = r0.Y
                            long r3 = r0.b()
                            long r0 = r1 - r3
                        L57:
                            r8.t0 = r0
                            long r2 = r8.s0
                            int r2 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
                            if (r2 <= 0) goto L63
                            r8.M0()
                            goto L6e
                        L63:
                            java.lang.Object r8 = r8.b
                            oaa r8 = (defpackage.oaa) r8
                            kba r8 = (defpackage.kba) r8
                            ru.ok.messages.media.trim.rangeSeekBar.RangeSeekBarView r8 = r8.x0
                            r8.setPointerPosition(r0)
                        L6e:
                            return
                        */
                        throw new UnsupportedOperationException("Method not decompiled: defpackage.maa.accept(java.lang.Object):void");
                    }
                }, i3, new p89(26)));
                break;
            case 4:
                ((naa) obj).D0();
                break;
            case 5:
                naa naaVar2 = (naa) obj;
                long j4 = naaVar2.Y;
                oaa oaaVar = (oaa) naaVar2.b;
                if (naaVar2.Z != 0 || naaVar2.s0 != j4) {
                    naaVar2.M0();
                    naaVar2.Z = 0L;
                    naaVar2.s0 = j4;
                    kba kbaVar2 = (kba) oaaVar;
                    kbaVar2.x0.setStartPosition(0L);
                    kbaVar2.x0.setEndPosition(naaVar2.s0);
                    kbaVar2.x0.setPointerPosition(naaVar2.Z);
                    TimeUnit timeUnit = TimeUnit.MILLISECONDS;
                    kbaVar2.v0.setText(ml6.c(timeUnit.toSeconds(naaVar2.Z)));
                    kbaVar2.w0.setText(ml6.c(timeUnit.toSeconds(naaVar2.s0)));
                    naaVar2.X.i(naaVar2.Z);
                    naaVar2.O0();
                    break;
                }
                break;
            case 6:
                FrgTrimVideo frgTrimVideo2 = ((naa) obj).c;
                frgTrimVideo2.B0();
                frgTrimVideo2.s0();
                break;
            case 7:
                final naa naaVar3 = (naa) obj;
                xd8 xd8Var = naaVar3.X;
                if (xd8Var.f != null) {
                    wqi.c("xd8", "Play %s", xd8Var.a);
                    xd8Var.j = true;
                    xd8Var.b.play();
                }
                bwd.b(naaVar3.w0);
                psa psaVarJ = vqa.j(30L, 30L, TimeUnit.MILLISECONDS, de.a());
                v08 v08Var = new v08(new gu3() { // from class: maa
                    @Override // defpackage.gu3
                    public final void accept(Object v) {
                        /*
                            this = this;
                            int r0 = r2
                            switch(r0) {
                                case 0: goto L35;
                                default: goto L5;
                            }
                        L5:
                            java.lang.String r8 = (java.lang.String) r8
                            naa r0 = r1
                            ru.ok.messages.media.trim.FrgTrimVideo r1 = r0.c
                            long r2 = r0.Z
                            long r4 = r0.s0
                            r1.getClass()
                            android.content.Intent r0 = new android.content.Intent
                            r0.<init>()
                            java.lang.String r6 = "ru.ok.tamtam.extra.START_POSITION"
                            r0.putExtra(r6, r2)
                            java.lang.String r2 = "ru.ok.tamtam.extra.END_POSITION"
                            r0.putExtra(r2, r4)
                            java.lang.String r2 = "ru.ok.tamtam.extra.THUMBNAIL_URI"
                            r0.putExtra(r2, r8)
                            d6 r8 = r1.u0()
                            r2 = -1
                            r8.setResult(r2, r0)
                            r1.B0()
                            r1.s0()
                            return
                        L35:
                            java.lang.Long r8 = (java.lang.Long) r8
                            naa r8 = r1
                            xd8 r0 = r8.X
                            f2h r1 = r0.f
                            if (r1 != 0) goto L40
                            goto L46
                        L40:
                            fl5 r0 = r0.b
                            f2h r1 = r0.Y
                            if (r1 != 0) goto L49
                        L46:
                            r0 = 0
                            goto L57
                        L49:
                            j1f r1 = r0.a
                            long r1 = r1.e()
                            f2h r0 = r0.Y
                            long r3 = r0.b()
                            long r0 = r1 - r3
                        L57:
                            r8.t0 = r0
                            long r2 = r8.s0
                            int r2 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
                            if (r2 <= 0) goto L63
                            r8.M0()
                            goto L6e
                        L63:
                            java.lang.Object r8 = r8.b
                            oaa r8 = (defpackage.oaa) r8
                            kba r8 = (defpackage.kba) r8
                            ru.ok.messages.media.trim.rangeSeekBar.RangeSeekBarView r8 = r8.x0
                            r8.setPointerPosition(r0)
                        L6e:
                            return
                        */
                        throw new UnsupportedOperationException("Method not decompiled: defpackage.maa.accept(java.lang.Object):void");
                    }
                }, pdf.f, pdf.d);
                psaVarJ.a(v08Var);
                naaVar3.w0 = v08Var;
                break;
            case 8:
                naa naaVar4 = (naa) obj;
                boolean z4 = !naaVar4.x0;
                naaVar4.x0 = z4;
                ((kba) ((oaa) naaVar4.b)).B(z4, naaVar4.X.d());
                break;
            case 9:
                n95 n95Var = ((yub) obj).b;
                r95 r95Var = n95Var.a;
                ArrayList arrayList = n95Var.d;
                if (!arrayList.isEmpty()) {
                    u9 u9Var = (u9) wy1.d(arrayList, 1);
                    u9Var.a(r95Var);
                    arrayList.remove(u9Var);
                    n95Var.e.add(u9Var);
                    r95Var.invalidate();
                    n95Var.b();
                    break;
                }
                break;
            case 10:
                ((yub) obj).c.O();
                break;
            case 11:
                ActPhotoEditor actPhotoEditor = ((yub) obj).c;
                if (!((Boolean) actPhotoEditor.V0.getValue()).booleanValue()) {
                    ScheduledSendPickerDialogFragment.D0("ru.ok.messages.photoeditor.ActPhotoEditor", actPhotoEditor.z());
                    break;
                } else {
                    actPhotoEditor.P(null);
                    break;
                }
            case Protos.Attaches.Attach.PRESENT /* 12 */:
                ActPhotoEditor actPhotoEditor2 = ((yub) obj).c;
                Bundle bundle = new Bundle();
                bundle.putInt("ru.ok.tamtam.extra.CONTENT_RES_ID", mvd.n1);
                bundle.putInt("ru.ok.tamtam.extra.POSITIVE_TEXT_RES_ID", mvd.q1);
                bundle.putInt("ru.ok.tamtam.extra.NEGATIVE_TEXT_RES_ID", mvd.p);
                ConfirmationDialog confirmationDialog = new ConfirmationDialog();
                confirmationDialog.n0(bundle);
                confirmationDialog.x0(actPhotoEditor2.z(), "ru.ok.messages.views.dialogs.ConfirmationDialog");
                break;
            case 13:
                yub yubVar = (yub) obj;
                n95 n95Var2 = yubVar.b;
                boolean z5 = !n95Var2.a().d;
                bvb bvbVar = yubVar.e;
                bvbVar.getClass();
                bvb bvbVar2 = new bvb(bvbVar.a, bvbVar.b, bvbVar.c, bvbVar.d, z5, bvbVar.X, bvbVar.Y);
                yubVar.e = bvbVar2;
                yubVar.a.a(bvbVar2);
                n95Var2.a.setDrawStickerEnabled(z5);
                yubVar.d.a(n95Var2, n95Var2.a(), false);
                break;
            case Protos.Attaches.Attach.LOCATION /* 14 */:
                ((ec0) obj).d = Integer.valueOf(bhd.j0.d);
                break;
            case Protos.Attaches.Attach.DAILY_MEDIA /* 15 */:
                break;
            default:
                Throwable th = (Throwable) obj;
                wqi.e("VideoMessageCameraEffect", "Failed init camera effect due to " + th.getLocalizedMessage(), th);
                break;
        }
    }
}
