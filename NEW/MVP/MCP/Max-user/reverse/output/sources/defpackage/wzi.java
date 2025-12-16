package defpackage;

import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public abstract class wzi {
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:158:0x0260 A[Catch: all -> 0x026d, LOOP:6: B:156:0x025a->B:158:0x0260, LOOP_END, TryCatch #4 {all -> 0x026d, blocks: (B:504:0x0748, B:505:0x0753, B:507:0x0759, B:508:0x0766, B:512:0x0771, B:513:0x0776, B:514:0x0777, B:155:0x024f, B:156:0x025a, B:158:0x0260, B:161:0x0270, B:165:0x027b, B:166:0x0280, B:167:0x0281, B:169:0x0286, B:188:0x02cc, B:176:0x029a, B:177:0x02a5, B:179:0x02ab, B:180:0x02b8, B:184:0x02c3, B:185:0x02c8, B:186:0x02c9, B:189:0x02d2, B:192:0x02de, B:222:0x0341, B:223:0x034c, B:225:0x0352, B:226:0x035f, B:230:0x036a, B:231:0x036f, B:232:0x0370, B:233:0x0371, B:252:0x03b7, B:240:0x0385, B:241:0x0390, B:243:0x0396, B:244:0x03a3, B:248:0x03ae, B:249:0x03b3, B:250:0x03b4, B:253:0x03bd, B:260:0x03d2, B:261:0x03dd, B:263:0x03e3, B:264:0x03f0, B:268:0x03fb, B:269:0x0400, B:270:0x0401, B:272:0x0405, B:279:0x041a, B:280:0x0425, B:282:0x042b, B:283:0x0438, B:287:0x0443, B:288:0x0448, B:289:0x0449, B:298:0x0460, B:299:0x046b, B:301:0x0471, B:302:0x047e, B:306:0x0489, B:307:0x048e, B:308:0x048f, B:312:0x0497, B:315:0x04a4, B:345:0x0507, B:346:0x0512, B:348:0x0518, B:349:0x0525, B:353:0x0530, B:354:0x0535, B:355:0x0536, B:356:0x0537, B:375:0x057e, B:363:0x054c, B:364:0x0557, B:366:0x055d, B:367:0x056a, B:371:0x0575, B:372:0x057a, B:373:0x057b, B:376:0x0584, B:426:0x062f, B:427:0x063a, B:429:0x0640, B:430:0x064d, B:434:0x0658, B:435:0x065d, B:436:0x065e, B:382:0x0598, B:383:0x05a3, B:385:0x05a9, B:386:0x05b6, B:390:0x05c1, B:391:0x05c6, B:392:0x05c7, B:437:0x065f, B:488:0x0708, B:489:0x0713, B:491:0x0719, B:492:0x0726, B:496:0x0731, B:497:0x0736, B:498:0x0737, B:443:0x0671, B:444:0x067c, B:446:0x0682, B:447:0x068f, B:451:0x069a, B:452:0x069f, B:453:0x06a0, B:499:0x0738, B:515:0x0778, B:559:0x0815, B:560:0x0820, B:562:0x0826, B:563:0x0833, B:567:0x083e, B:568:0x0843, B:569:0x0844, B:516:0x077a, B:536:0x07bf, B:555:0x0806, B:543:0x07d4, B:544:0x07df, B:546:0x07e5, B:547:0x07f2, B:551:0x07fd, B:552:0x0802, B:553:0x0803, B:557:0x080f, B:522:0x078b, B:523:0x0796, B:525:0x079c, B:528:0x07ac, B:532:0x07b7, B:533:0x07bc, B:534:0x07bd, B:519:0x0785, B:540:0x07cc, B:440:0x066b, B:396:0x05cc, B:415:0x0609, B:416:0x0611, B:418:0x0617, B:422:0x0624, B:424:0x0628, B:401:0x05d6, B:402:0x05e1, B:404:0x05e7, B:407:0x05f6, B:411:0x0601, B:412:0x0606, B:413:0x0607, B:237:0x037f, B:501:0x0742, B:360:0x0546, B:457:0x06a5, B:476:0x06e1, B:477:0x06e9, B:479:0x06ef, B:484:0x06fe, B:486:0x0702, B:462:0x06ae, B:463:0x06b9, B:465:0x06bf, B:468:0x06ce, B:472:0x06d9, B:473:0x06de, B:474:0x06df, B:193:0x02e0, B:213:0x0324, B:215:0x032c, B:217:0x0332, B:218:0x0335, B:220:0x033a, B:199:0x02f1, B:200:0x02fc, B:202:0x0302, B:205:0x0311, B:209:0x031c, B:210:0x0321, B:211:0x0322, B:257:0x03ca, B:316:0x04a6, B:336:0x04ea, B:338:0x04f2, B:340:0x04f8, B:341:0x04fb, B:343:0x0500, B:322:0x04b7, B:323:0x04c2, B:325:0x04c8, B:328:0x04d7, B:332:0x04e2, B:333:0x04e7, B:334:0x04e8, B:379:0x0591, B:276:0x0412, B:173:0x0294, B:295:0x0458), top: B:622:0x0748, inners: #2, #5, #8, #13, #15, #18, #19, #20, #21, #25, #27, #28, #29, #33 }] */
    /* JADX WARN: Removed duplicated region for block: B:168:0x0282  */
    /* JADX WARN: Removed duplicated region for block: B:575:0x085b A[Catch: all -> 0x0868, LOOP:2: B:573:0x0855->B:575:0x085b, LOOP_END, TryCatch #1 {all -> 0x0868, blocks: (B:572:0x084a, B:573:0x0855, B:575:0x085b, B:578:0x086a, B:582:0x0875, B:583:0x087a, B:584:0x087b), top: B:618:0x084a }] */
    /* JADX WARN: Removed duplicated region for block: B:590:0x089b A[LOOP:3: B:588:0x0895->B:590:0x089b, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:593:0x08b0  */
    /* JADX WARN: Removed duplicated region for block: B:600:0x08be A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:642:0x0742 A[EXC_TOP_SPLITTER, PHI: r29
  0x0742: PHI (r29v26 c9a) = 
  (r29v8 c9a)
  (r29v9 c9a)
  (r29v10 c9a)
  (r29v11 c9a)
  (r29v12 c9a)
  (r29v13 c9a)
  (r29v14 c9a)
  (r29v15 c9a)
  (r29v16 c9a)
  (r29v17 c9a)
  (r29v18 c9a)
  (r29v27 c9a)
 binds: [B:500:0x0740, B:438:0x0667, B:377:0x058d, B:357:0x0540, B:314:0x04a2, B:293:0x0455, B:273:0x040d, B:254:0x03c5, B:234:0x0379, B:191:0x02dc, B:170:0x028e, B:40:0x00a9] A[DONT_GENERATE, DONT_INLINE], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:681:0x0278 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:702:0x0872 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:724:0x0880 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static defpackage.dh2 a(defpackage.tm9 r32) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 2344
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.wzi.a(tm9):dh2");
    }

    public static void b(whb whbVar, int i, fu3 fu3Var) {
        long jG = whbVar.g(i);
        List listM = whbVar.m(jG);
        if (((ArrayList) listM).isEmpty()) {
            return;
        }
        if (i == whbVar.d.length - 1) {
            throw new IllegalStateException();
        }
        long jG2 = whbVar.g(i + 1) - whbVar.g(i);
        if (jG2 > 0) {
            fu3Var.accept(new kb4(jG, jG2, listM));
        }
    }
}
